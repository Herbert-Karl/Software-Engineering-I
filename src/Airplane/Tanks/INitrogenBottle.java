package Airplane.Tanks;

public interface INitrogenBottle {
    public String version();
    public void takeOut(int amount);
    public void refill();
    public void refill(int amount);
}