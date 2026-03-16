package session7.XuatSac1;

public class PercentageDiscount implements DiscountStrategy{
    private double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * percent/100;
    }
}
