package Airplane.src.Tanks;

public interface IPotableWaterTank {
    public String version();
    public void lock();
    public void unlock();
    public void takeOut(int amount);
    public void refill();
    public void refill(int amount);
}
