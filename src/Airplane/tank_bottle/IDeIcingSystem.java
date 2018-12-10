package Airplane.tank_bottle;

public interface IDeIcingSystem {
    String version();
    void activate();
    void deIce(int amount);
    void refill();
    void deactivate();
}
