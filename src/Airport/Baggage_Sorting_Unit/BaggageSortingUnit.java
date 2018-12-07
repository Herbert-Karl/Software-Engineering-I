package src.Airport.Baggage_Sorting_Unit;

import java.util.ArrayList;

import Airport.Airport.GateID;
import Airport.Base.Baggage;
import Airport.Base.Container;
import Airport.Base.Employee;


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

    @Override
    public void executeRequest(GateID gateID) {

    }

    @Override
    public void loginBaggageScanner(Employee employee, String password) {

    }

    @Override
    public void logoutBaggageScanner() {

    }

    @Override
    public boolean scan(Baggage baggage, String pattern) {
        return false;
    }

    @Override
    public void handOverToCustoms(Baggage baggage) {

    }

    @Override
    public void throwOff(LuggageTub luggageTub, DestinationBox destinationBox) {

    }

    @Override
    public void emptyDestinationBox() {

    }

    @Override
    public void sendContainerLifterToGate() {

    }

    @Override
    public void optimizeAirplaneLoading() {

    }

    @Override
    public void setBaggageVehicle() {

    }

    @Override
    public void loadBaggageVehicle(LoadingStrategy strategy) {

    }

    @Override
    public void sendBaggageVehicleToGate() {

    }

    @Override
    public void notifyGroundOperations(BaggageSortingUnitReceipt baggageSortingUnitReceipt) {

    }

    @Override
    public void returnEmptyLuggageTubToCheckInDesk() {

    }
}
