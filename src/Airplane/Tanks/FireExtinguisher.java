package Airplane.Tanks;

public class FireExtinguisher implements IFireExtinguisher {
    private String manufacturer;
    private String type;
    private String id;
    private int currentPercentage;

    public FireExtinguisher(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentPercentage = 0;
    }

    public FireExtinguisher(String manufacturer, String type, String id, int currentPercentage) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        setCurrentPercentage(currentPercentage);
    }

    public String version() {
        return (id + "-" + type);
    }

    public void refill() {
        currentPercentage = 100;
    }

    public void apply() {
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
