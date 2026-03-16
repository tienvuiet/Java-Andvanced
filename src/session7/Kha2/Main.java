package session7.Kha2;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Customer customer = new Customer("Tien", "tien@gmail.com", "Hanoi");

        Product p1 = new Product("P01", "Laptop", 1500);
        Product p2 = new Product("P02", "Mouse", 50);

        Order order = new Order("O01", customer, Arrays.asList(p1, p2));

        OrderCalculator calculator = new OrderCalculator();
        order.total = calculator.calculateTotal(order);

        OrderRepository repository = new OrderRepository();
        repository.save(order);

        EmailService emailService = new EmailService();
        emailService.sendEmail(customer);

        System.out.println("Total order: " + order.total);
    }
}
