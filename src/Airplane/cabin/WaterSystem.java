package Airplane.cabin;

public class WaterSystem implements IWaterSystem {
    String manufacturer;
    String type;
    String id;
    boolean isOn;
    boolean isFilled;
    boolean isCleaned;

    public WaterSystem(String manufacturer, String type, String id, boolean isOn, boolean isFilled, boolean isCleaned) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isOn = isOn;
        this.isFilled = isFilled;
        this.isCleaned = isCleaned;
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

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public boolean isCleaned() {
        return isCleaned;
    }

    public void setCleaned(boolean cleaned) {
        isCleaned = cleaned;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void on() {

    }

    @Override
    public void refill() {

    }

    @Override
    public void off() {

    }

    @Override
    public void clean() {

    }
}
