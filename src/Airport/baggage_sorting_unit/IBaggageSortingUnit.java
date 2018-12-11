package Airport.baggage_sorting_unit;

import Airport.airport.GateID;
import Airport.base.Baggage;
import Airport.base.DestinationBox;
import Airport.base.Employee;
import Airport.base.LuggageTube;

public interface IBaggageSortingUnit {
    void executeRequest(GateID gateID);
    void loginBaggageScanner(Employee employee, String password);
    void logoutBaggageScanner();
    boolean scan(Baggage baggage, String pattern);
    void handOverToCustoms(Baggage baggage);
    void throwOff(LuggageTube luggageTube, DestinationBox destinationBox);
    void emptyDestinationBox();
    void sendContainerLiftToGate();
    void optimizeAirplaneLoading();
    void setBaggageVehicle();
    void loadBaggageVehicle(LoadingStrategy strategy);
    void sendBaggageVehicleToGate();
    void notifyGroundOperations(BaggageSortingUnitReceipt baggageSortingUnitReceipt);
    void returnEmptyLuggageTubeToCheckInDesk();
}
