package Airplane.tank_bottle;

public class PotableWaterTank implements IPotableWaterTank {
    private String manufacturer;
    private String type;
    private String id;
    private int capacity;
    private boolean isLocked;
    private int currentAmount;

    public PotableWaterTank(String manufacturer, String type, String id, boolean isLocked, int currentAmount) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isLocked = isLocked;
        this.currentAmount = currentAmount;
        this.capacity = 1000;
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

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    @Override
    public String version() {
        return "<" + id + "> - <" + type + ">";
    }

    @Override
    public void unlock() {
        this.isLocked = false;
    }

    @Override
    public void refill() {
        this.currentAmount = this.capacity;
    }

    @Override
    public void refill(int amount) {
        if (this.currentAmount + amount <= this.capacity) {
            this.currentAmount += amount;
        }
    }

    @Override
    public void lock() {
        this.isLocked = true;
    }

    @Override
    public void takeOut(int amount) {
        this.currentAmount -= amount;
    }
}
