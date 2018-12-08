package Airplane.cabin;

import Airplane.airplanePart.AirplanePart;

public class EscapeSlide implements IEscapeSlide {
    private AirplanePart escapeSlide;
    private boolean isActivated;

    public EscapeSlide(String id, String type) {
        escapeSlide.setAll(id, type, "Escape Slide");
        isActivated = false;
    }

    @Override
    public String version() {
        return escapeSlide.version();
    }

    @Override
    public void activate() {
        if (!isActivated) isActivated = true;
    }

    @Override
    public void test() {
        System.out.println("Test ausgeführt");
    }
}
