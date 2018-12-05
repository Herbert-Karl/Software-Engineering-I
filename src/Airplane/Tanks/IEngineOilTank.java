package Airplane.Tanks;

public interface IEngineOilTank {
    String version();
    void increaseLevel(int value);
    void decreaseLevel(int value);
}