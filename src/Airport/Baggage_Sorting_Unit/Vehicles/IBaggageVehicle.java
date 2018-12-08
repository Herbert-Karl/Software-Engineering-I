package src.Airport.Baggage_Sorting_Unit.Vehicles;

import java.util.Collection;

public interface IBaggageVehicle extends IVehicle {

    void store(Airport.Base.Container container);

    void store(Collection<Airport.Base.Baggage> b);

    void connect(IContainerLifter containerLifter);

    void transferContainerToLifter();

    void disconnect();

    void returnToBaggageSortingUnit();

    IContainerLifter getContainerLifter();
}
