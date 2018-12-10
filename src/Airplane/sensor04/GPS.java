package Airplane.sensor04;

public class GPS implements IGPS {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isOn;
    private boolean isConnected;

    public GPS(String manufacturer, String type, String id, boolean isOn, boolean isConnected) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isOn = isOn;
        this.isConnected = isConnected;
    }

    @Override
    public String verion() {
        return null;
    }

    @Override
    public void on() {

    }

    @Override
    public void connect(String satellite) {

    }

    @Override
    public void send(String request) {

    }

    @Override
    public String recieve() {
        return null;
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
}
