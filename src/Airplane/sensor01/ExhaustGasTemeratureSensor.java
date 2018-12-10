package Airplane.sensor01;

public class ExhaustGasTemeratureSensor implements IExhaustGasTemeratureSensor {
    String manufacturer;
    String type;
    String id;
    int temperature;
    boolean isAlarmMajor;
    boolean isAlarmCritical;

    public ExhaustGasTemeratureSensor(String manufacturer, String type, String id, int temperature, boolean isAlarmMajor, boolean isAlarmCritical) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.temperature = temperature;
        this.isAlarmMajor = isAlarmMajor;
        this.isAlarmCritical = isAlarmCritical;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void measure() {

    }

    @Override
    public void alarmMajor(int threshold) {

    }

    @Override
    public void alarmCritical(int threshold) {

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

    public boolean isAlarmMajor() {
        return isAlarmMajor;
    }

    public void setAlarmMajor(boolean alarmMajor) {
        isAlarmMajor = alarmMajor;
    }

    public boolean isAlarmCritical() {
        return isAlarmCritical;
    }

    public void setAlarmCritical(boolean alarmCritical) {
        isAlarmCritical = alarmCritical;
    }
}
