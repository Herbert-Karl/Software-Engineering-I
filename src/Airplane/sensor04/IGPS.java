package Airplane.sensor04;

public interface IGPS {
    String verion();
    void on();
    void connect(String satellite);
    void send(String request);
    String recieve();
    void off();
}
