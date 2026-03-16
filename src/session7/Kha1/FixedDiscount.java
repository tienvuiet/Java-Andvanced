package session7.Kha1;

public class FixedDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount-50000;
    }
}
