package Airplane.sensor01;

public interface IFuelSensor {
    String version();
    void measure();
    void alarmReserve(int threshold);
    void alarmMajor(int threshold);
    void alarmCritical(int threshold);
}
