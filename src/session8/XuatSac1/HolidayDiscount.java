package session8.XuatSac1;

public class HolidayDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.2;
    }
}
