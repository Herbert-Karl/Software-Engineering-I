package Airplane.cabin;

public interface IKitchen {
    String version();
    void lock();
    void unlock();
    double getTotalWeightTrolleys();
    void addTrolley(Trolley trolley);
    void emptyTrolley(Trolley trolley);
}
