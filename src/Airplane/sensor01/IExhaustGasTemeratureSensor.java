package Airplane.sensor01;

public interface IExhaustGasTemeratureSensor {
    String version();
    void measure();
    void alarmMajor(int threshold);
    void alarmCritical(int threshold);
}
