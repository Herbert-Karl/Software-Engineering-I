package Airplane.Tanks;

public interface IWasteWaterTank {
    String version();
    void lock();
    void unlock();
    void add(int amount);
    void pumpOut();
}
