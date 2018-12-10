package Airplane.cabin;

public class WasteSystem implements IWasteSystem {
    String manufacturer;
    String type;
    String id;
    String[] waste;
    boolean isOn;
    boolean isCleaned;

    public WasteSystem(String manufacturer, String type, String id, String[] waste, boolean isOn, boolean isCleaned) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.waste = waste;
        this.isOn = isOn;
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

    public String[] getWaste() {
        return waste;
    }

    public void setWaste(String[] waste) {
        this.waste = waste;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
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
    public int deposit(String[] waste) {
        return 0;
    }

    @Override
    public void off() {

    }

    @Override
    public void clean() {

    }
}
