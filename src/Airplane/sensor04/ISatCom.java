package Airplane.sensor04;

public interface ISatCom {
    String version();
    void on();
    void connect(String satellite, String frequency);
    void send(String request);
    String recieve();
    void off();
}
