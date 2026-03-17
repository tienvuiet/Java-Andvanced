package session8.Kha1;

public class FanFactory extends DeviceFactory{
    @Override
    public Device createDevice() {
        System.out.println("FanFactory: da tao quat moi");
        return new Fan();
    }
}
