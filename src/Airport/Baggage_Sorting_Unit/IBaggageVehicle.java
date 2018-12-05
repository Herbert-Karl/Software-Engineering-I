package src.Airport.Baggage_Sorting_Unit;

public interface IBaggageVehicle extends IVehicle {
    void store(Airport.Base.Container container);
    void connect(IContainerLifter containerLifter);
    void transferContainerToLifter();
    void disconnect(IContainerLifter containerLifter);
    void returnToBaggageSortingUnit();

}
