package Airplane.tank_bottle;

public interface IPotableWaterTank {
    String version();
    void unlock();
    void refill();
    void refill(int amount);
    void lock();
    void takeOut(int amount);
}
