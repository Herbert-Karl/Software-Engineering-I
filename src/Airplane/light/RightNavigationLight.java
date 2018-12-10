package Airplane.light;

public class RightNavigationLight implements IRightNavigationLight {
    String manufacturer;
    String type;
    String id;
    Position position;
    boolean isOn;

    public RightNavigationLight(String manufacturer, String type, String id, Position position, boolean isOn) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.position = position;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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
    public void off() {

    }

    @Override
    public void setLightType(String type) {

    }

    @Override
    public void setPosition(String position) {

    }
}
