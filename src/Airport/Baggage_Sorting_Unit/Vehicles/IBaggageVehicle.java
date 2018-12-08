package Airport.Baggage_Sorting_Unit.Vehicles;

import java.util.Collection;

public interface IBaggageVehicle extends Airport.Baggage_Sorting_Unit.Vehicles.IVehicle {

    void store(Airport.Base.Container container);

    void store(Collection<Airport.Base.Baggage> b);

    void connect(Airport.Baggage_Sorting_Unit.Vehicles.IContainerLifter containerLifter);

    void transferContainerToLifter();

    void disconnect();

    void returnToBaggageSortingUnit();

    Airport.Baggage_Sorting_Unit.Vehicles.IContainerLifter getContainerLifter();
}
