package Airplane.seat;

import Airplane.airplanePart.*;

public class ReadingLight implements IReadingLight {

    private IAirplanePart light;
    private boolean isOn;
    // constructor
    public ReadingLight()
    {
        light = new AirplanePart("ReadingLight");
        isOn = false;
    }
    
    @Override
    public void on() {
        isOn = true;
    }
    
    @Override
    public void off() {
        isOn = false;
    }
    
    @Override
    public String version() {
        return light.version();
    }
}
