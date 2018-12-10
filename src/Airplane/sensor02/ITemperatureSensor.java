package Airplane.sensor02;

public interface ITemperatureSensor {
    String version();
    void measure();
    void alarm(int threshold);
}
