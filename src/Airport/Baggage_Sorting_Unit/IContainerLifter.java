package src.Airport.Baggage_Sorting_Unit;

public interface IContainerLifter extends IVehicle {
void connectToAirplane();
void up();
void transferContainerToCargoSystem();
void down();
void disconnectFromAirplane();
void notifyGroundOperations(ContainerLifterReceipt containerLifterReceipt);
void returnToAirportResourcePool();
void setContainer(Airport.Base.Container c);

}
