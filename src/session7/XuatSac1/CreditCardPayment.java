package session7.XuatSac1;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan the tin dung: "+ amount);
    }
}
