package src.Airport.Baggage_Sorting_Unit;

import java.util.ArrayList;
import Airport.Base.Container;


public class BaggageSortingUnit implements IBaggageSortingUnit {
    private ArrayList<Airport.Base.Employee> employeeList;
    private ArrayList<String> scanPatternList;
    private IBaggageScanner baggageScanner;
    private IBaggageSortingUnitRoboter roboter;
    private BaggageDepot baggageDepot;
    private DestinationBox destinationBox;
    private ArrayList<LuggageTub> emptyLuggageTubList;
    private ArrayList<Container> emptyContainerList;
    private ArrayList<Container> filledContainerList;
    private IBaggageVehicle baggageVehicle;
    private ICustoms customs;


    @java.lang.Override
    public void executeRequest(Airport.Airport.GateID gateID) {

    }

    @java.lang.Override
    public void loginBaggageScanner(Airport.Base.Employee employee, String password) {

    }

    @java.lang.Override
    public void logoutBaggageScanner() {

    }

    @java.lang.Override
    public boolean scan(Airport.Base.Baggage baggage, String pattern) {
        return false;
    }

    @java.lang.Override
    public void handOverToCustoms(Airport.Base.Baggage baggage) {

    }

    @java.lang.Override
    public void throwOff(LuggageTub luggageTub, DestinationBox destinationBox) {

    }

    @java.lang.Override
    public void emptyDestinationBox() {

    }

    @java.lang.Override
    public void sendContainerLifterToGate() {

    }

    @java.lang.Override
    public void optimizeAirplaneLoading() {

    }

    @java.lang.Override
    public void setBaggageVehicle() {

    }

    @Override
    public void loadBaggageVehicle(LoadingStrategy strategy) {

    }

    @java.lang.Override
    public void loadBaggageVehicle(Baggage_Sorting_Unit.LoadingStrategy strategy) {

    }

    @java.lang.Override
    public void sendBaggageVehicleToGate() {

    }

    @Override
    public void notifyGroundOperations(BaggageSortingUnitReceipt baggageSortingUnitReceipt) {

    }

    @java.lang.Override
    public void notifyGroundOperations(Baggage_Sorting_Unit.BaggageSortingUnitReceipt baggageSortingUnitReceipt) {

    }

    @java.lang.Override
    public void returnEmptyLuggageTubToCheckInDesk() {

    }
}
