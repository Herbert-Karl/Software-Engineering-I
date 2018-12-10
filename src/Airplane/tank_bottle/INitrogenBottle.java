package Airplane.tank_bottle;

public interface INitrogenBottle {
    String version();
    void takeOut(int amount);
    void refill();
    void refill(int amount);
}
