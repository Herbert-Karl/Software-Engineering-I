package Airport.Baggage_Sorting_Unit.Vehicles;

import Airport.Base.Container;

public interface IBaggageVehicle extends IVehicle {

    void store(Container container);

    void connect(IContainerLifter containerLifter);

    void transferContainerToLifter();

    void disconnect();

    void returnToBaggageSortingUnit();

    IContainerLifter getContainerLifter();
}
