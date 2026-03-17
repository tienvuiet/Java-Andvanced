package session8.XuatSac1;

public class CODPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan Cod: "+ amount);
    }
}
