package session8.Gioi1;

public class PaymentProcessor {
    public void processPayment(PaymentMethod payment, double amount) {

        if (payment instanceof CODPayable) {
            ((CODPayable) payment).processCOD(amount);
        }

        if (payment instanceof CardPayable) {
            ((CardPayable) payment).processCreditCard(amount);
        }

        if (payment instanceof EWalletPayable) {
            ((EWalletPayable) payment).processMomo(amount);
        }
    }
}
