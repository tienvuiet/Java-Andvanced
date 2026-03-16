package session7.XuatSac1;

//import session7.Gioi1.PaymentMethod;

public class OrderService {
    private OrderRepository repository;
    private NotificationService notification;

    public OrderService(OrderRepository repository, NotificationService notification) {
        this.repository = repository;
        this.notification = notification;
    }
    public void createOrder(Order order, DiscountStrategy discount, PaymentMethod payment){
        double total = order.getTotal();
        double discountValue = discount.applyDiscount(total);
        double finalAmout = total - discountValue;
        payment.pay(finalAmout);
        repository.save(order);
        notification.send("Order created");
        InvoiceGenerator.printInvoice(order, discountValue);

    }
}
