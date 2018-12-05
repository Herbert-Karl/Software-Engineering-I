package Airplane.Tanks;

public interface IFuelTank {
    public String version();
    public void takeOut(int amount);
    public void refill();
    public void refill(int amount);
}