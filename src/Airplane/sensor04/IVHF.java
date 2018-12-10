package Airplane.sensor04;

public interface IVHF {
    String version();
    void on();
    void forwardChannel();
    void backwardChannel();
    void selectChannel(String channel);
    void send(String request);
    String recieve();
    void off();
}
