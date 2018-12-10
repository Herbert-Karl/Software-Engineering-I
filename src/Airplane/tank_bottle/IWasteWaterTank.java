package Airplane.tank_bottle;

public interface IWasteWaterTank {
    String version();
    void lock();
    void unlock();
    void add(int amount);
    void pumpOut();
}
