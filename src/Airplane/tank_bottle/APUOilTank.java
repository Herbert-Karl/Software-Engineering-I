package Airplane.tank_bottle;

public class APUOilTank implements IAPUOilTank {
    private String manufacturer;
    private String type;
    private String id;
    private int maximumLevel;
    private int currentLevel;

    public APUOilTank(String manufacturer, String type, String id, int currentLevel) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentLevel = currentLevel;
        this.maximumLevel = 5;
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

    public int getMaximumLevel() {
        return maximumLevel;
    }

    public void setMaximumLevel(int maximumLevel) {
        this.maximumLevel = maximumLevel;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public String version() {
        return "<" + id + "> - <" + type + ">";
    }

    @Override
    public void increaseLevel(int value) {
        this.currentLevel = this.currentLevel + value;
    }

    @Override
    public void decreaseLevel(int value) {
        this.currentLevel = this.currentLevel - value;
    }
}
