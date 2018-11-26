
public class EngineOilTank implements IEngineOilTank {
    private String manufacturer;
    private String type;
    private String id;
    private int maximumLevel = 5;
    private int currentLevel;

    public EngineOilTank(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentLevel = 0;
    }

    public EngineOilTank(String manufacturer, String type, String id, int maximumLevel) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentLevel = 0;
        this.maximumLevel = maximumLevel;
    }

    public String version() {
        return (id + "-" + type);
    }

    public void increaseLevel(int value) {
        if(currentLevel + value > maximumLevel)
            currentLevel = maximumLevel;
        else if(currentLevel + value < 0)
            currentLevel = 0;   // If value is negative
        else
            currentLevel += value;
    }

    public void decreaseLevel(int value) {
        if(currentLevel - value < 0)
            currentLevel = 0;
        else if(currentLevel - value > maximumLevel)
            currentLevel = maximumLevel;    //If value is negative
        else
            currentLevel -= value;
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

    public int getMaximumLevel() {
        return this.maximumLevel;
    }

    public void setMaximumLevel(int maximumLevel) {
        if(maximumLevel < 0)
            this.maximumLevel = 0;
        else
            this.maximumLevel = maximumLevel;
    }

    public int getCurrentLevel() {
        return this.currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        if(currentLevel > maximumLevel)
            this.currentLevel = maximumLevel;
        else if(currentLevel < 0)
            this.currentLevel = 0;
        else
            this.currentLevel = currentLevel;
    }
}
