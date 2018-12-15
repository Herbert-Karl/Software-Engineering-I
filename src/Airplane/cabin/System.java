package Airplane.cabin;

import Airplane.airplanePart.AirplanePart;

public abstract class System implements ISystem {

    protected AirplanePart system;
    protected boolean isOn;
    protected boolean isCleaned;

    protected void setSystem(String id, String type, String manufacturer){
        system.setAll(id, type, manufacturer);
        isOn = false;
        isCleaned = true;
    }

    @Override
    public String version() {
        return system.version();
    }

    @Override
    public void on() {
        if(!isOn) isOn = true;
    }

    @Override
    public void off() {
        if(isOn) isOn = false;
    }



    @Override
    public void clean() {
        if (!isCleaned) isCleaned = true;

    }
}
