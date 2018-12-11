package Airport.Baggage_Sorting_Unit.Vehicles;

import Airport.Airport.Gate;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Base.Container;

public interface IContainerLifter extends IVehicle {

  void connectToAirplane();

  void up();

  void transferContainerToCargoSystem();

  void down();

  void disconnectFromAirplane();

  void notifyGroundOperations(ContainerLifterReceipt containerLifterReceipt);

  void returnToAirportResourcePool();

  void setContainer(Container c);

  void setGate(Gate gate);

  Gate getGate();
}
