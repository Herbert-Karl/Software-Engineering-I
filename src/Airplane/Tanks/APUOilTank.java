package Airplane.Tanks;

public class APUOilTank implements IAPUOilTank {
    private String manufacturer;
    private String type;
    private String id;
    private int maximumLevel = 5;
    private int currentLevel;

    public APUOilTank(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentLevel = 0;
    }

    public APUOilTank(String manufacturer, String type, String id, int maximumLevel) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.maximumLevel = maximumLevel;
        this.currentLevel = 0;
    }

    public String version() {
        return (id + "-" + type);
    }

    public void increaseLevel(int value) {
        if(currentLevel + value > maximumLevel)
            currentLevel = maximumLevel;
        else
            currentLevel += value;
    }

    public void decreaseLevel(int value) {
        if(currentLevel - value < 0)
            currentLevel = 0;
        else
            currentLevel -= value;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setMaximumLevel(int maximumLevel) {
        this.maximumLevel = maximumLevel;
    }

    public int getMaximumLevel() {
        return maximumLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        if(currentLevel > maximumLevel)
            this.currentLevel = maximumLevel;
        else if (currentLevel < 0)
            this.currentLevel = 0;
        else
            this.currentLevel = currentLevel;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }
}
