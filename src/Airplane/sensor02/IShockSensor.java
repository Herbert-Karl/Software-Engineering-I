package Airplane.sensor02;

public interface IShockSensor {
    String version();
    void calibrate();
    void calibrate(double level);
    int measure();
    void alarm();
}
