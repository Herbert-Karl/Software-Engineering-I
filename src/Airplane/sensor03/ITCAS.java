package Airplane.sensor03;

public interface ITCAS {
    String version();
    void on();
    void connect(String frequency);
    boolean scan(String environment);
    void alarm();
    void determineAltitude(String environment);
    void setAltitude(int value);
    void off();
}
