package session7.XuatSac1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private  String id;
    private Customer customer;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Customer customer, String id) {
        this.customer = customer;
        this.id = id;
    }
    public void addItem(OrderItem item){
        items.add(item);
    }
    public double getTotal(){
        return items.stream()
                .mapToDouble(OrderItem::getTotal)
                .sum();
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
