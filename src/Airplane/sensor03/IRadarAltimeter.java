package Airplane.sensor03;

public interface IRadarAltimeter {
    String version();
    void on();
    void send(String radioWave);
    int recieve(String radioWave);
    int measureAltitude();
    void off();
}
