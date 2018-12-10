package Airplane.sensor03;

public interface ITurbulentAirFlowSensor {
    String version();
    int measure(String airflow);
    void alarm();
}
