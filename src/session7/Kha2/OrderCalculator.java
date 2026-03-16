package session7.Kha2;

public class OrderCalculator {
    public  double calculateTotal(Order order){
        double total  = 0;
        for (Product p: order.products){
            total += p.price;
        }
        return total;
    }
}
