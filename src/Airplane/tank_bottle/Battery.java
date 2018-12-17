package Airplane.tank_bottle;

public class Battery implements IBattery {
    private String manufacturer;
    private String type;
    private String id;
    private int capacity;
    private int currentPercentage;

    public Battery(String manufacturer, String type, String id, int currentPercentage) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentPercentage = currentPercentage;
        this.capacity = 100;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentPercentage() {
        return currentPercentage;
    }

    public void setCurrentPercentage(int currentPercentage) {
        this.currentPercentage = currentPercentage;
    }

    @Override
    public String version() {
        return "<" + id + "> - <" + type + ">";
    }

    @Override
    public void charge() {
        this.capacity = 100;
    }

    @Override
    public void discharge() {
        this.capacity = 0;
    }
}
