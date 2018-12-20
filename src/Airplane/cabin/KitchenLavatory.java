package Airplane.cabin;

import Airplane.airplanePart.*;

public abstract class KitchenLavatory implements IKitchenLavatory {

    protected IAirplanePart kitchenLavatory;
    protected boolean isLocked;

    protected KitchenLavatory(String type) {
        kitchenLavatory = new AirplanePart(type);
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
