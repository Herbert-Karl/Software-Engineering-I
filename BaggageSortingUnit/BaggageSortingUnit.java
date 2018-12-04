package BaggageSortingUnit;
import java.util.ArrayList;



public class BaggageSortingUnit implements IBaggageSortingUnit {
    private ArrayList<Employee> employeeList;
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
    public void executeRequest(GateID gateID) {

    }

    @java.lang.Override
    public void loginBaggageScanner(Employee employee, String password) {

    }

    @java.lang.Override
    public void logoutBaggageScanner() {

    }

    @java.lang.Override
    public boolean scan(Baggage baggage, String pattern) {
        return false;
    }

    @java.lang.Override
    public void handOverToCustoms(Baggage baggage) {

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

    @java.lang.Override
    public void loadBaggageVehicle(LoadingStrategy strategy) {

    }

    @java.lang.Override
    public void sendBaggageVehicleToGate() {

    }

    @java.lang.Override
    public void notifyGroundOperations(BaggageSortingUnitReceipt baggageSortingUnitReceipt) {

    }

    @java.lang.Override
    public void returnEmptyLuggageTubToCheckInDesk() {

    }
}
