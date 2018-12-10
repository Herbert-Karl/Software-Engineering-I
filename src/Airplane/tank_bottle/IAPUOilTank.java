package Airplane.tank_bottle;

public interface IAPUOilTank {
    String version();
    void increaseLevel(int value);
    void decreaseLevel(int value);
}
