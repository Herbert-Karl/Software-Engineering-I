package Airplane.door;

public interface IBulkCargoDoor {
    String version();

    void close(); // war vorher boolean

    void lock(); // war vorher boolean

    void unlock(); // war vorher boolean

    void open(); // war vorher boolean
}
