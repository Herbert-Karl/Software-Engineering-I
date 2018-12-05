package Airplane.Tanks;

public interface IOxygenBottle {
    String version();
    void takeOut(int amount);
    void refill();
    void refill(int amount);
}