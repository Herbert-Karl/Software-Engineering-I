package Airport.Baggage_Sorting_Unit.Vehicles;

import Airport.Baggage_Sorting_Unit.IBaggageSortingUnit;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;

public interface IContainerLifter extends Airport.Baggage_Sorting_Unit.Vehicles.IVehicle {

    void connectToAirplane();

    void up();

    void transferContainerToCargoSystem();

    void down();

    void disconnectFromAirplane();

    void notifyGroundOperations(ContainerLifterReceipt containerLifterReceipt);

    void returnToAirportResourcePool();

    void setContainer(Airport.Base.Container c);

    IBaggageSortingUnit getBaggageSortingUnit():
}
