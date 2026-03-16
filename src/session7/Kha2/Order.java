package session7.Kha2;

import java.util.List;

public class Order {
    String orderId;
    Customer customer;
    List<Product> products;
    double total;

    public Order(String orderId, Customer customer, List<Product> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
    }
}
