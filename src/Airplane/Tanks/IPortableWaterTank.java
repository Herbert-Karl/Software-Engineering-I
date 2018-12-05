package Airplane.Tanks;

public interface IPortableWaterTank {
    String version();
    void lock();
    void unlock();
    void takeOut(int amount);
    void refill();
    void refill(int amount);
}
