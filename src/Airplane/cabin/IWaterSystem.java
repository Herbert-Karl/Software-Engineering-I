package Airplane.cabin;

public interface IWaterSystem {
    public String version();

    public void on(); // war vorher boolean

    public void refill(); // war vorher boolean

    public void off(); // war vorher boolean

    public void clean(); // war vorher boolean
}
