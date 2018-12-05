package Airplane.Tanks;

public interface IFuelTank {
    String version();
    void takeOut(int amount);
    void refill();
    void refill(int amount);
}