package Airplane.cabin;

public class WaterSystem extends System implements IWaterSystem {
    private boolean isFilled;

    public WaterSystem(String id, String type) {
        setSystem(id, type, "Water System");
        isFilled = false;
    }

    @Override
    public void refill() {
        if (!isFilled) isFilled = true;
    }

    @Override
    public void clean() {
        // Methode clean hat 2 Auswirkungen
        // isFilled false und isCleaned true
        isFilled = false;
        isCleaned = true;
    }
}
