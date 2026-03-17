package session8.XuatSac1;

public class InvoiceGenerator {
    public static void printInvoice(Order order, double discount){
        System.out.println("Hoa don: ");
        System.out.println("Khach: "+ order.getCustomer().getName());
        for (OrderItem item: order.getItems()){
            System.out.println(
                    item.getProduct().getId()
                    + " - So luong: "+ item.getQuantity()
                    + " - Don gia: " + item.getProduct().getPrice()
                    +" - Thanh tien: " + item.getTotal()
            );
        }
        double total = order.getTotal();
        System.out.println("Tong tien: "+ total);
        System.out.println("Giam gia: "+ discount);
        System.out.println("Can thanh toan: " + (total-discount));
    }
}
