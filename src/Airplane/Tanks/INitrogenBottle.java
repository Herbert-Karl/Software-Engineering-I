package Airplane.Tanks;

public interface INitrogenBottle {
    String version();
    void takeOut(int amount);
    void refill();
    void refill(int amount);
}