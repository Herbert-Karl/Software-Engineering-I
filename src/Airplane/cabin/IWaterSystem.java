package Airplane.cabin;

public interface IWaterSystem {
    String version();
    void on();
    void refill();
    void off();
    void clean();
}
