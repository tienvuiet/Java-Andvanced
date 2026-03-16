package session7.Kha1;

public class NoDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double totalAmount) {
        return  totalAmount;
    }
}
