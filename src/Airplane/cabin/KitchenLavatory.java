package Airplane.cabin;

import Airplane.airplanePart.AirplanePart;

public abstract class KitchenLavatory implements IKitchenLavatory {

    protected AirplanePart kitchenLavatory;
    protected boolean isLocked;

    protected void setLavatory(String id, String type, String manufacturer){
        kitchenLavatory.setAll(id, type, manufacturer);
        isLocked = false;
    }

    public void setKitchen(String id, String manufacturer) {
        kitchenLavatory.setIDandBrand(id, manufacturer);
        isLocked = false;
    }

    public String version() {
        return kitchenLavatory.version();
    }

    public void lock() {
        if (!isLocked) isLocked = true;
    }

    public void unlock() {
        if (isLocked) isLocked = false;
    }

}
