package session8.Kha1;

public class Fan implements Device{
    @Override
    public void turnOff() {
        System.out.println("Quat: tat");
    }

    @Override
    public void turnOn() {
        System.out.println("Quat: bat");
    }
}
