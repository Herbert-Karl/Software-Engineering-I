package Airplane.Tanks;

public class Battery implements IBattery {
    private String manufacturer;
    private String type;
    private String id;
    private int capacity = 100;
    private int currentPercentage;

    public Battery(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentPercentage = 0;
    }

    public Battery(String manufacturer, String type, String id, int capacity) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.capacity = capacity;
        this.currentPercentage = 0;
    }

    public String version() {
        return (id + "-" + type);
    }

    public void charge() {
        currentPercentage = 100;
    }

    public void discharge() {
        currentPercentage = 0;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentPercentage() {
        return this.currentPercentage;
    }

    public void setCurrentPercentage(int currentPercentage) {
        if(currentPercentage > 100)
            this.currentPercentage = 100;
        else if(currentPercentage < 0)
            this.currentPercentage = 0;
        else
            this.currentPercentage = currentPercentage;
    }
}
