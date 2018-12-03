package BaggageSortingUnit;
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
    void setBaggageVehicle();
    void loadBaggageVehicle(LoadingStrategy strategy);
    void sendBaggageVehicleToGate();
    void notifyGroundOperations(BaggageSortingUnitReceipt baggageSortingUnitReceipt);
    void returnEmptyLuggageTubToCheckInDesk();
}