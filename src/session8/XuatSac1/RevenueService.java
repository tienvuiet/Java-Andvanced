package session8.XuatSac1;

public class RevenueService {
    public static double calculateRevenue(OrderRepository repo){
        return repo.findAll().stream().mapToDouble(Order::getTotal).sum();
    }
}
