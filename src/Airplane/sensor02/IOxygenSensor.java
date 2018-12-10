package Airplane.sensor02;

public interface IOxygenSensor {
    String version();
    int measure(String airFlow);
    void alarm();
}
