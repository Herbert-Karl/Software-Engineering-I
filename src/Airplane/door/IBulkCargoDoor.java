package Airplane.door;

public interface IBulkCargoDoor {
    String version();
    void close();
    void lock();
    void unlock();
    void open();
}
