package session7.XuatSac1;

public class FixedDiscount implements DiscountStrategy{
    private double value;

    public FixedDiscount(double value) {
        this.value = value;
    }

    @Override
    public double applyDiscount(double amount) {
        return value;
    }
}
