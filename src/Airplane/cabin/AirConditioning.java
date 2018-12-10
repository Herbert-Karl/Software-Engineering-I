package Airplane.cabin;

public class AirConditioning implements IAirConditioning {
    private String manufacturer;
    private String type;
    private String id;
    private int temperature;
    private boolean isOn;

    public AirConditioning(String manufacturer, String type, String id, int temperature, boolean isOn) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.temperature = temperature;
        this.isOn = isOn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

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
