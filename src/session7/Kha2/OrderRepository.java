package session7.Kha2;

public class OrderRepository {
    public void save(Order order) {
        System.out.println("Order saved: " + order.orderId);
    }
}
