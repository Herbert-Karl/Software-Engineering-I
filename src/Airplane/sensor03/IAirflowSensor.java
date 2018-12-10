package Airplane.sensor03;

public interface IAirflowSensor {
    String version();
    int measure(String airFlow);
    void alarm(int threshold);
}
