package BaggageSortingUnit;

public interface IContainerLifter extends IVehicle{
void connectToAirplane();
void up();
void transferCargoSystem();
void down();
void disconnectFromAirplane();
void notifyGroundOperations(ContainerLifterReceipt containerLifterReceipt);
void returnToAirportResourcePool();

}
