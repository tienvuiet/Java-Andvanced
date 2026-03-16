package session7.XuatSac1;

public class MomoPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan momo: "+ amount);
    }
}
