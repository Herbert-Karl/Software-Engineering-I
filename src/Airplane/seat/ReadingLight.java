package Airplane.seat;

import Airplane.airplanePart.IAirplanePart;

public class ReadingLight implements IReadingLight {

    private IAirplanePart light;
    private boolean isOn;
    // constructor
    public ReadingLight(String ID)
    {
        light = new AirplanePart();
        light.setAll(ID, "ReadingLight");
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
