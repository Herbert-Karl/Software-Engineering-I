package Airplane.sensor02;

public class TemperatureSensor implements ITemperatureSensor {
    private String manufacturer;
    private String type;
    private String id;
    private int temperature;
    private boolean isAlarm;

    public TemperatureSensor(String manufacturer, String type, String id, int temperature, boolean isAlarm) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.temperature = temperature;
        this.isAlarm = isAlarm;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void measure() {

    }

    @Override
    public void alarm(int threshold) {

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

    public boolean isAlarm() {
        return isAlarm;
    }

    public void setAlarm(boolean alarm) {
        isAlarm = alarm;
    }
}
