package session8.Kha2;

public class SmartHomeFacade {
    private Light light;
    private Fan fan;
    private AirConditioner airConditioner;
    private TemperatureSensor sensor;

    public SmartHomeFacade(Light light, Fan fan, AirConditioner airConditioner, TemperatureSensor sensor) {
        this.light = light;
        this.fan = fan;
        this.airConditioner = airConditioner;
        this.sensor = sensor;
    }

    public void leaveHome() {

        light.off();
        fan.off();
        airConditioner.off();

    }

    public void sleepMode() {

        light.off();
        airConditioner.setTempurature(28);
        fan.lowspeed();

    }

    public void getCurrentTemperature() {

        double temp = sensor.getTemperaTureCelsius();

        System.out.printf("Nhiệt độ hiện tại: %.1f°C\n", temp);

    }
}
