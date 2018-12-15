package Airplane.door;

public interface IBulkCargoDoor {
    public String version();

    public void close(); // war vorher boolean

    public void lock(); // war vorher boolean

    public void unlock(); // war vorher boolean

    public void open(); // war vorher boolean
}
