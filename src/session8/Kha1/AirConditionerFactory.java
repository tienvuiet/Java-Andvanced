package session8.Kha1;

public class AirConditionerFactory extends DeviceFactory{
    @Override
    public Device createDevice() {
        System.out.println("AirConditionerFactory: da tao dieu hoa moi");
        return new AirConditioner();
    }
}
