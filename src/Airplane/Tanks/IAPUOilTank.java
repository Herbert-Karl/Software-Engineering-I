package Airplane.Tanks;

public interface IAPUOilTank {
    String version();
    void increaseLevel(int value);
    void decreaseLevel(int value);
}
