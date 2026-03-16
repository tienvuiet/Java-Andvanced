package session7.XuatSac1;

public class VNpayPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan VNpay: "+ amount);
    }
}
