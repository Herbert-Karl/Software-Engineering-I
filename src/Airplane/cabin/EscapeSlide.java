package Airplane.cabin;

import Airplane.airplanePart.*;

public class EscapeSlide implements IEscapeSlide {
    private IAirplanePart escapeSlide;
    private boolean isActivated;

    // constructor for this class
    public EscapeSlide() {
        escapeSlide = new AirplanePart("Escape Slide");
        isActivated = false;
    }

    @Override
    // the version contains id and type
    public String version() {
        return escapeSlide.version();
    }

    @Override
    // set the attribute isActivated to true
    public void activate() {
        if (!isActivated) isActivated = true;
    }

    @Override
    // print the string
    public void test() {
        java.lang.System.out.println("Test ausgeführt");
    }
}
