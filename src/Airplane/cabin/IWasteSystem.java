package Airplane.cabin;

public interface IWasteSystem {
    public String version();

    public void on(); // war vorher boolean

    public int deposit(String[] waste);

    public void off(); // war vorher boolean

    public void clean(); // war vorher boolean
}
