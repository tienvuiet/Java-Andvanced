package session7.Kha1;

public class PercentageDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount*0.9;
    }
}
