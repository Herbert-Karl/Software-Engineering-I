package BaggageSortingUnit;

public interface IBaggageVehicle extends IVehicle{
    void store(Container container);
    void connect(IContainerLifter containerLifter);
    void transferContainerToLifter();
    void disconnect(IContainerLifter containerLifter);
    void returnToBaggageSortingUnit();

}
