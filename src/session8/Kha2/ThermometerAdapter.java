package session8.Kha2;

public class ThermometerAdapter implements TemperatureSensor{
    private OldThermometer oldThermometer;

    public ThermometerAdapter(OldThermometer oldThermometer) {
        this.oldThermometer = oldThermometer;
    }

    @Override
    public double getTemperaTureCelsius() {
        int f = oldThermometer.getTemperatureFahrenheit();
        double c = (f-32) *5/9;
        return c;
    }
}
