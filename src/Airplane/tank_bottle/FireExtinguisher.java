package Airplane.tank_bottle;

public class FireExtinguisher implements IFireExtinguisher {
    String manufacturer;
    String type;
    String id;
    int currentPercentage;

    public FireExtinguisher(String manufacturer, String type, String id, int currentPercentage) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentPercentage = currentPercentage;
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

    public int getCurrentPercentage() {
        return currentPercentage;
    }

    public void setCurrentPercentage(int currentPercentage) {
        this.currentPercentage = currentPercentage;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void refill() {

    }

    @Override
    public void apply() {

    }
}
