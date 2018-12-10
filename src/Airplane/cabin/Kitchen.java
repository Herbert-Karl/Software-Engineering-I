package Airplane.cabin;

import java.util.ArrayList;

public class Kitchen implements IKitchen {
    String manufacturer;
    KitchenType kitchenType;
    String id;
    ArrayList<Trolley> trolleyList;
    boolean isLocked;
    boolean isFilled;

    public Kitchen(String manufacturer, KitchenType kitchenType, String id, ArrayList<Trolley> trolleyList, boolean isLocked, boolean isFilled) {
        this.manufacturer = manufacturer;
        this.kitchenType = kitchenType;
        this.id = id;
        this.trolleyList = trolleyList;
        this.isLocked = isLocked;
        this.isFilled = isFilled;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public KitchenType getKitchenType() {
        return kitchenType;
    }

    public void setKitchenType(KitchenType kitchenType) {
        this.kitchenType = kitchenType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Trolley> getTrolleyList() {
        return trolleyList;
    }

    public void setTrolleyList(ArrayList<Trolley> trolleyList) {
        this.trolleyList = trolleyList;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void lock() {

    }

    @Override
    public void unlock() {

    }

    @Override
    public double getTotalWeightTrolleys() {
        return 0;
    }

    @Override
    public void addTrolley(Trolley trolley) {

    }

    @Override
    public void emptyTrolley(Trolley trolley) {

    }
}
