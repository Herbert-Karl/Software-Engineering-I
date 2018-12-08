package Airplane.Tanks;

public class OxygenBottle implements IOxygenBottle {
    private String manufacturer;
    private String type;
    private String id;
    private int capacity = 100;
    private int currentAmount;

    public OxygenBottle(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentAmount = 0;
    }

    public OxygenBottle(String manufacturer, String type, String id, int capacity) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentAmount = 0;
        this.capacity = capacity;
    }

    public String version() {
        return (id + "-" + type);
    }

    public void takeOut(int amount) {
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

    public void refill(int amount) {
        if(currentAmount + amount > capacity)
            currentAmount = capacity;
        else if(currentAmount + amount < 0)
            currentAmount = 0;  // If amount is negative
        else
            currentAmount += amount;
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
