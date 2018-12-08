package Airplane.cabin;

import java.util.ArrayList;

public class Kitchen implements IKitchen {
    private String manufacturer;
    private KitchenType kitchenType;
    private String id;
    private ArrayList<Trolley> trolleyList;
    private boolean isLocked;
    private boolean isFilled;

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
