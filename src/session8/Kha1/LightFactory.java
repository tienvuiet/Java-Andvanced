package session8.Kha1;

public class LightFactory extends DeviceFactory{
    @Override
    public Device createDevice() {
        System.out.println("LightFactory: da tao den moi");
        return  new Light();
    }
}
