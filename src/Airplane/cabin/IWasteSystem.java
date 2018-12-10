package Airplane.cabin;

public interface IWasteSystem {
    String version();
    void on();
    int deposit(String[] waste);
    void off();
    void clean();
}
