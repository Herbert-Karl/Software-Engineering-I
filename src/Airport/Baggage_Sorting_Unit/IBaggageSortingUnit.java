package Airport.Baggage_Sorting_Unit;

import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.Loading.LoadingStrategy;
import Airport.Baggage_Sorting_Unit.Receipts.BaggageSortingUnitReceipt;
import Airport.Baggage_Sorting_Unit.Storage.BaggageDepot;
import Airport.Baggage_Sorting_Unit.Vehicles.IBaggageVehicle;
import Airport.Base.Baggage;
import Airport.Base.DestinationBox;
import Airport.Base.Employee;
import Airport.Base.LuggageTub;

public interface IBaggageSortingUnit {

  void executeRequest(GateID gateID);

  void loginBaggageScanner(Employee employee, String password);

  void logoutBaggageScanner();

  boolean scan(Baggage baggage, String pattern);

  void handOverToCustoms(Baggage baggage);

  void throwOff(LuggageTub luggageTub, DestinationBox destinationBox);

  void emptyDestinationBox();

  void sendContainerLifterToGate();

  void optimizeAirplaneLoading();

  void setBaggageVehicle(IBaggageVehicle vehicle);

  void loadBaggageVehicle(LoadingStrategy strategy);

  void sendBaggageVehicleToGate();

  void notifyGroundOperations(BaggageSortingUnitReceipt baggageSortingUnitReceipt);

  void returnEmptyLuggageTubToCheckInDesk();

  BaggageDepot getDepot();

  IBaggageVehicle getVehicle();

  void setGate(Gate gate);

  Gate getGate();
}