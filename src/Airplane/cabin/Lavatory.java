package Airplane.cabin;

public class Lavatory extends KitchenLavatory implements ILavatory {
    private boolean isCleaned;

    @Override
    // set isCleaned to true
    public void clean() {
        if (!isCleaned) isCleaned = true ;
    }
}
