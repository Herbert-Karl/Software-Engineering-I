package Airplane.sensor03;

public class TCAS implements ITCAS {
    String manufacturer;
    String type;
    String id;
    boolean isOn;
    boolean isConnected;
    boolean isAlarm;
    int altitude;

    public TCAS(String manufacturer, String type, String id, boolean isOn, boolean isConnected, boolean isAlarm, int altitude) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isOn = isOn;
        this.isConnected = isConnected;
        this.isAlarm = isAlarm;
        this.altitude = altitude;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void on() {

    }

    @Override
    public void connect(String frequency) {

    }

    @Override
    public boolean scan(String environment) {
        return false;
    }

    @Override
    public void alarm() {

    }

    @Override
    public void determineAltitude(String environment) {

    }

    @Override
    public void off() {

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

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public boolean isAlarm() {
        return isAlarm;
    }

    public void setAlarm(boolean alarm) {
        isAlarm = alarm;
    }

    public int getAltitude() {
        return altitude;
    }

    @Override
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
