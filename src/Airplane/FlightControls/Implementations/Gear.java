package Airplane.FlightControls.Implementations;

public class Gear {
    private boolean isDown = true;

    public void up() {
        isDown = false;
    }

    public void ddown() {
        isDown = true;
    }
}
