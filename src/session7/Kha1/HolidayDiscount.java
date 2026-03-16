package session7.Kha1;

public class HolidayDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount - totalAmount * 0.15;
    }
}
