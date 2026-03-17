package session8.Kha1;

public class AirConditioner implements Device{
    @Override
    public void turnOn() {
        System.out.println("Dieu hoa: bat");
    }

    @Override
    public void turnOff() {
        System.out.println("Dieu hoa: tat");
    }
}
