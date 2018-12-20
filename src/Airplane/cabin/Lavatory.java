package Airplane.cabin;

public class Lavatory extends KitchenLavatory {
    private boolean isCleaned;

    public Lavatory() {
        super("Lavatory");
    }

    // set isCleaned to true
    public void clean() {
        if (!isCleaned) isCleaned = true ;
    }
}