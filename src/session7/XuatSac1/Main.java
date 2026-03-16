package session7.XuatSac1;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {
        ProductService productService = new ProductService();
        CustomerService customerService = new CustomerService();

        OrderRepository repository = new FileOrderRepository();
        NotificationService notification = new EmailNotification();

        OrderService orderService = new OrderService(repository, notification);

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Thêm khách hàng");
            System.out.println("3. Tạo đơn hàng");
            System.out.println("4. Xem danh sách đơn hàng");
            System.out.println("5. Tính tổng doanh thu");
            System.out.println("0. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {

                case 1:
                    System.out.print("Mã sản phẩm: ");
                    String id = sc.nextLine();
                    System.out.print("Tên sản phẩm: ");
                    String name = sc.nextLine();
                    System.out.print("Giá: ");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.print("Danh mục: ");
                    String category = sc.nextLine();
                    Product p = new Product(id, name, price, category);
                    productService.addProduct(p);
                    break;

                // Thêm khách hàng
                case 2:
                    System.out.print("Tên: ");
                    String cname = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Điện thoại: ");
                    String phone = sc.nextLine();
                    Customer c = new Customer(cname, email, phone);
                    customerService.addCustomer(c);
                    break;

                // Tạo đơn hàng
                case 3:

                    System.out.print("Nhập tên khách: ");
                    String customerName = sc.nextLine();
                    Customer customer = customerService.findByName(customerName);
                    if (customer == null) {
                        System.out.println("Không tìm thấy khách hàng");
                        break;
                    }
                    System.out.print("Nhập mã sản phẩm: ");
                    String productId = sc.nextLine();

                    Product product = productService.findById(productId);

                    if (product == null) {
                        System.out.println("Không tìm thấy sản phẩm");
                        break;
                    }

                    System.out.print("Số lượng: ");
                    int quantity = Integer.parseInt(sc.nextLine());

                    Order order = new Order(customer,"ORD" + (repository.findAll().size() + 1));

                    order.addItem(new OrderItem(product, quantity));

                    System.out.println("Chọn giảm giá:");
                    System.out.println("1. 10%");
                    System.out.println("2. Giảm 100000");
                    System.out.println("3. Holiday 20%");

                    int d = Integer.parseInt(sc.nextLine());

                    DiscountStrategy discount;

                    switch (d) {
                        case 1:
                            discount = new PercentageDiscount(10);
                            break;
                        case 2:
                            discount = new FixedDiscount(100000);
                            break;
                        default:
                            discount = new HolidayDiscount();
                    }

                    System.out.println("Chọn thanh toán:");
                    System.out.println("1. COD");
                    System.out.println("2. Credit Card");
                    System.out.println("3. Momo");
                    System.out.println("4. VNPay");

                    int pay = Integer.parseInt(sc.nextLine());

                    PaymentMethod payment;

                    switch (pay) {
                        case 1:
                            payment = new CODPayment();
                            break;
                        case 2:
                            payment = new CreditCardPayment();
                            break;
                        case 3:
                            payment = new MomoPayment();
                            break;
                        default:
                            payment = new VNpayPayment();
                    }

                    orderService.createOrder(order, discount, payment);


                    break;

                // Xem đơn hàng
                case 4:

                    List<Order> orders = repository.findAll();

                    for (Order o : orders) {
                        System.out.println(
                                o.getId()
                                        + " - "
                                        + o.getCustomer().getName()
                                        + " - "
                                        + o.getTotal()
                        );
                    }

                    break;

                // Tính doanh thu
                case 5:

                    double revenue = RevenueService.calculateRevenue(repository);

                    System.out.println("Tổng doanh thu: " + revenue);

                    break;

                case 0:

                    System.out.println("Thoát chương trình");
                    return;

                default:

                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
