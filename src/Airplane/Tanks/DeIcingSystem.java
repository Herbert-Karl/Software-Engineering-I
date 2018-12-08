package Airplane.Tanks;

public class DeIcingSystem implements IDeIcingSystem {
    private String manufacturer;
    private String type;
    private String id;
    private int capacity = 1000;
    private int currentAmount;
    private boolean isActivated;

    public DeIcingSystem(String manufacturer, String type, String id, boolean isActivated) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentAmount = 0;
        this.isActivated = isActivated;
    }

    public DeIcingSystem(String manufacturer, String type, String id, boolean isActivated, int capacity) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentAmount = 0;
        this.isActivated = isActivated;
        this.capacity = capacity;
    }

    public String version() {
        return (id + "-" + type);
    }

    public void activate() {
        isActivated = true;
    }

    public void deactivate() {
        isActivated = false;
    }

    public void deIce(int amount) {
        if(currentAmount - amount < 0)
            currentAmount = 0;
        else if(currentAmount - amount > capacity)
            currentAmount = capacity;   // If amount is negative
        else
            currentAmount -= amount;
    }

    public void refill() {
        currentAmount = capacity;
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

    public boolean getIsActivated() {
        return this.isActivated;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity < 0)
            this.capacity = 0;
        else
            this.capacity = capacity;
    }

    public int getCurrentAmount() {
        return this.currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        if(currentAmount > capacity)
            this.currentAmount = capacity;
        else if(currentAmount < 0)
            this.currentAmount = 0;
        else
            this.currentAmount = currentAmount;
    }
}