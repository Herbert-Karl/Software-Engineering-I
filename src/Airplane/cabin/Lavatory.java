package Airplane.cabin;

public class Lavatory extends KitchenLavatory implements ILavatory {
    private boolean isCleaned;

    @Override
    public void clean() {
        if (!isCleaned) isCleaned = true ;
    }
}
