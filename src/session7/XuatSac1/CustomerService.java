package session7.XuatSac1;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();
    public void addCustomer(Customer customer){
        customers.add(customer);
        System.out.println("Da them khach hang: "+customer.getName());
    }
    public Customer findByName(String name){
        return customers.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
