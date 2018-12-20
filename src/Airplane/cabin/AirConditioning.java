package Airplane.cabin;

import Airplane.airplanePart.*;

public class AirConditioning implements IAirConditioning {
    private IAirplanePart airConditioning;
    private int temperature;
    private boolean isOn;

    // constructor for this class
    public  AirConditioning(String type) {
        airConditioning = new AirplanePart(type);
        temperature = 17;
        isOn = false;
    }

    @Override
    // the version contains id and type
    public String version() {
        return airConditioning.version();
    }

    @Override
    // set isOn to true
    public void on() {
        isOn = true;
    }

    @Override
    // replace a char (X) in the string airFlow
    public String clean(String airFlow) { // z.B. alle X aus der Zeichenkette entfernen
        airFlow = airFlow.replace("X", "");
        return airFlow;
    }


    @Override
    // set new temperature and returns heat as string
    public String heat(String airFlow, int temperature) {
        this.temperature = temperature;
        airFlow = "heat";   // airFlow ist eigentlich unnötig, da direkt ein String hätte zurück gegeben werden können
        return airFlow;
    }

    @Override
    // set new temperature and returns cool as string
    public String cool(String airFlow, int temperature) {
        this.temperature = temperature;
        airFlow = "cool";
        return airFlow;
    }

    @Override
    // set isOn to false
    public void off() {
        isOn = false;
    }
}
