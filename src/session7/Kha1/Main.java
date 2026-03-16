package session7.Kha1;

public class Main {
    static void main(String[] args) {
        double totalAmount = 1000000;
        DiscountStrategy ac = new PercentageDiscount();
        DiscountStrategy FD = new FixedDiscount();
        DiscountStrategy ND = new NoDiscount();
        DiscountStrategy HD = new HolidayDiscount();
        System.out.println("PercentageDiscount: " + ac.applyDiscount(totalAmount));
        System.out.println("FixedDiscount: "+ FD.applyDiscount(totalAmount));
        System.out.println("NoDiscount: "+ ND.applyDiscount(totalAmount));
        System.out.println("HolidayDiscount: "+HD.applyDiscount(totalAmount));
    }
}
