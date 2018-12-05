package Airplane.Tanks;

public interface IDeIcingSystem {
    String version();
    void activate();
    void deactivate();
    void deIce(int amount);
    void refill();
}