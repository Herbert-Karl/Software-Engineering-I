package Airplane.sensor03;

public class AirflowSensor implements IAirflowSensor {
    String manufacturer;
    String type;
    String id;
    int airPreasure;
    boolean isAlarm;

    public AirflowSensor(String manufacturer, String type, String id, int airPreasure, boolean isAlarm) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.airPreasure = airPreasure;
        this.isAlarm = isAlarm;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public int measure(String airFlow) {
        return 0;
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

    public int getAirPreasure() {
        return airPreasure;
    }

    public void setAirPreasure(int airPreasure) {
        this.airPreasure = airPreasure;
    }

    public boolean isAlarm() {
        return isAlarm;
    }

    public void setAlarm(boolean alarm) {
        isAlarm = alarm;
    }
}
