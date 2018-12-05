package Airplane.src.Tanks;

public interface IOxygenBottle {
    public String version();
    public void takeOut(int amount);
    public void refill();
    public void refill(int amount);
}