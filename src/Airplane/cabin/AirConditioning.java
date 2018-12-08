package Airplane.cabin;

public class AirConditioning implements IAirConditioning {
    private String manufacturer;
    private String type;
    private String id;
    private int temperature;
    private boolean isOn;

    @Override
    public String version() {
        return null;
    }

    @Override
    public void on() {

    }

    @Override
    public String clean(String airFlow) {
        return null;
    }

    @Override
    public String heat(String airFlow, int temperature) {
        return null;
    }

    @Override
    public String cool(String airFlow, int temperature) {
        return null;
    }

    @Override
    public void off() {

    }
}
