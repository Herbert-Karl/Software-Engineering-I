package Airplane.cabin;

import Airplane.airplanePart.AirplanePart;

public abstract class KitchenLavatory implements IKitchenLavatory {

    protected AirplanePart kitchenLavatory;
    protected boolean isLocked;

    // set Lavatory Attributes
    protected void setLavatory(String id, String type, String manufacturer){
        kitchenLavatory.setAll(id, type, manufacturer);
        isLocked = false;
    }

    // set Kitchen Attributes
    public void setKitchen(String id, String manufacturer) {
        kitchenLavatory.setIDandBrand(id, manufacturer);
        isLocked = false;
    }

    // version returns id and type
    public String version() {
        return kitchenLavatory.version();
    }

    // set isLocked to true
    public void lock() {
        if (!isLocked) isLocked = true;
    }

    // set isLocked to false
    public void unlock() {
        if (isLocked) isLocked = false;
    }
}
