package Airplane.cabin;

public class WaterSystem extends System implements IWaterSystem {
    private boolean isFilled;

    // constructor
    public WaterSystem(String id, String type) {
        setSystem(id, type, "Water System");
        isFilled = false;
    }

    @Override
    // set isFilled to true
    public void refill() {
        if (!isFilled) isFilled = true;
    }

    @Override
    // set isFilled to false and isCleaned to true
    public void clean() {
        // Methode clean hat 2 Auswirkungen
        // isFilled false und isCleaned true
        isFilled = false;
        isCleaned = true;
    }
}
