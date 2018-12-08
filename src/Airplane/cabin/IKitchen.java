package Airplane.cabin;

public interface IKitchen {
    public String version();

    public void lock(); // war vorher boolean

    public void unlock(); // war vorher boolean

    public double getTotalWeightTrolleys();

    public void addTrolley(Trolley trolley);

    public void emptyTrolley(Trolley trolley);
}
