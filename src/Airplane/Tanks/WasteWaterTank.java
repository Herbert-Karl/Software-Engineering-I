package Airplane.Tanks;

public class WasteWaterTank implements IWasteWaterTank {
    private String manufacturer;
    private String type;
    private String id;
    private int capacity = 1000;
    private int currentAmount;
    private boolean isLocked;

    public WasteWaterTank(String manufacturer, String type, String id, boolean isLocked) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentAmount = 0;
        this.isLocked = isLocked;
    }

    public WasteWaterTank(String manufacturer, String type, String id, int capacity, boolean isLocked) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.capacity = capacity;
        this.currentAmount = 0;
        this.isLocked = isLocked;
    }

    public String version() {
        return (id + "-" + type);
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock() {
        isLocked = false;
    }
    
    public void add(int amount) {
        if(currentAmount + amount > capacity)
            currentAmount = capacity;
        else if (currentAmount + amount < 0)
            currentAmount = 0;  // If amount is negative
        else
            currentAmount += amount;
    }

    public void pumpOut() {
        currentAmount = 0;
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

    public boolean getIsLocked() {
        return this.isLocked;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
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
