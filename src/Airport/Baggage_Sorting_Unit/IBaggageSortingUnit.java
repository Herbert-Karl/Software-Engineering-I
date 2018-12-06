package src.Airport.Baggage_Sorting_Unit;

public interface IBaggageSortingUnit {
    void executeRequest(Airport.Airport.GateID gateID);
    void loginBaggageScanner(Airport.Base.Employee employee, String password);
    void logoutBaggageScanner();
    boolean scan(Airport.Base.Baggage baggage, String pattern);
    void handOverToCustoms(Airport.Base.Baggage baggage);
    void throwOff(LuggageTub luggageTub, DestinationBox destinationBox);
    void emptyDestinationBox();
    void sendContainerLifterToGate();
    void optimizeAirplaneLoading();
    void setBaggageVehicle();
    void loadBaggageVehicle(LoadingStrategy strategy);
    void sendBaggageVehicleToGate();
    void notifyGroundOperations(BaggageSortingUnitReceipt baggageSortingUnitReceipt);
    void returnEmptyLuggageTubToCheckInDesk();

    BaggageDepot getDepot();
    IBaggageVehicle getVehicle();
}