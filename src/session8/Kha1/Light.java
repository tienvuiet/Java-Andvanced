package session8.Kha1;

public class Light implements Device{
    @Override
    public void turnOn() {
        System.out.println("Den: bat sang");
    }

    @Override
    public void turnOff() {
        System.out.println("Den: tat");
    }
}
