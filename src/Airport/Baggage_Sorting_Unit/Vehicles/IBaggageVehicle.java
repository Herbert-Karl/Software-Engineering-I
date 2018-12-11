package Airport.Baggage_Sorting_Unit.Vehicles;

import Airport.Base.Baggage;
import Airport.Base.Container;

import java.util.Collection;

public interface IBaggageVehicle extends IVehicle {

  void store(Container container);

  void store(Collection<Baggage> b);

  void connect(IContainerLifter containerLifter);

  void transferContainerToLifter();

  void disconnect();

  void returnToBaggageSortingUnit();

  IContainerLifter getContainerLifter();
}
