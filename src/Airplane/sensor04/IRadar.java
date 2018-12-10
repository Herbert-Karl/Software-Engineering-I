package Airplane.sensor04;

public interface IRadar {
    String version();
    void on();
    boolean scan(String environment);
    void off();
}
