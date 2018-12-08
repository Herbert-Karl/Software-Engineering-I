package Airplane.cabin;

public interface ILavatory {
    public String version();

    public void lock(); // war vorher boolean

    public void unlock(); // war vorher boolean

    public void clean(); // war vorher boolean
}
