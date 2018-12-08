package Airplane.cabin;

import Airplane.airplanePart.AirplanePart;

public class AirConditioning implements IAirConditioning {
    private AirplanePart airCOnditioning;
    private int temperature;
    private boolean isOn;

    public  AirConditioning(String id, String type, String manufacturer) {
        airCOnditioning.setAll(id, type, manufacturer);
        temperature = 17;
        isOn = false;
    }

    @Override
    public String version() {
        return airCOnditioning.version();
    }

    @Override
    public void on() {
        if(!isOn) isOn = true;
    }


    // für was ist airFlow?
    @Override
    public String clean(String airFlow) { // z.B. alle X aus der Zeichenkette entfernen
        airFlow = airFlow.replace("X", "");
        return airFlow;
    }


    public String heat(String airFlow, int temperature) {
        this.temperature = temperature;
        airFlow = "heat";   // airFlow ist eigentlich unnötig, da direkt ein String hätte zurück gegeben werden können
        return airFlow;
    }

    @Override
    public String cool(String airFlow, int temperature) {
        this.temperature = temperature;
        airFlow = "cool";
        return airFlow;
    }

    @Override
    public void off() {
        if(isOn) isOn = false;
    }
}
