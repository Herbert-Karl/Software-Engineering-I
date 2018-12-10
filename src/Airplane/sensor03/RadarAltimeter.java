package Airplane.sensor03;

public class RadarAltimeter implements IRadarAltimeter {
    String manufacturer;
    String type;
    String id;
    boolean isOn;
    int altitude;

    public RadarAltimeter(String manufacturer, String type, String id, boolean isOn, int altitude) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isOn = isOn;
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
    public void send(String radioWave) {

    }

    @Override
    public int recieve(String radioWave) {
        return 0;
    }

    @Override
    public int measureAltitude() {
        return 0;
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

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
