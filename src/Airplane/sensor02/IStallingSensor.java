package Airplane.sensor02;

public interface IStallingSensor {
    String version();
    int measure(String airFlow);
    void alarm();
}
