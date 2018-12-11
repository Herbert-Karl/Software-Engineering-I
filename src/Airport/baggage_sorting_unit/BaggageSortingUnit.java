package Airport.baggage_sorting_unit;

import Airport.airport.GateID;
import Airport.base.*;
import Airport.customs.ICustoms;
import Airport.scanner.IBaggageScanner;

import java.util.ArrayList;

public class BaggageSortingUnit implements IBaggageSortingUnit {
    private ArrayList<Employee> employeeArrayList;
    private ArrayList<String> scanPatternList;
    private IBaggageScanner baggageScanner;
    private IBaggageSortingUnitRoboter baggageSortingUnitRoboter;
    private BaggageDepot baggageDepot;
    private DestinationBox destinationBox;
    private ArrayList<LuggageTube> emptyLuggageTubeList;
    private ArrayList<Container> emptyContainerList;
    private ArrayList<Container> filledContainerList;
    private IBaggageVehicle baggageVehicle;
    private ICustoms customs;

    public BaggageSortingUnit(ArrayList<Employee> employeeArrayList, ArrayList<String> scanPatternList, IBaggageScanner baggageScanner, IBaggageSortingUnitRoboter baggageSortingUnitRoboter, BaggageDepot baggageDepot, DestinationBox destinationBox, ArrayList<LuggageTube> emptyLuggageTubeList, ArrayList<Container> emptyContainerList, ArrayList<Container> filledContainerList, IBaggageVehicle baggageVehicle, ICustoms customs) {
        this.employeeArrayList = employeeArrayList;
        this.scanPatternList = scanPatternList;
        this.baggageScanner = baggageScanner;
        this.baggageSortingUnitRoboter = baggageSortingUnitRoboter;
        this.baggageDepot = baggageDepot;
        this.destinationBox = destinationBox;
        this.emptyLuggageTubeList = emptyLuggageTubeList;
        this.emptyContainerList = emptyContainerList;
        this.filledContainerList = filledContainerList;
        this.baggageVehicle = baggageVehicle;
        this.customs = customs;
    }

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
    public void throwOff(LuggageTube luggageTube, DestinationBox destinationBox) {

    }

    @Override
    public void emptyDestinationBox() {

    }

    @Override
    public void sendContainerLiftToGate() {

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
    public void returnEmptyLuggageTubeToCheckInDesk() {

    }

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    public ArrayList<String> getScanPatternList() {
        return scanPatternList;
    }

    public void setScanPatternList(ArrayList<String> scanPatternList) {
        this.scanPatternList = scanPatternList;
    }

    public IBaggageScanner getBaggageScanner() {
        return baggageScanner;
    }

    public void setBaggageScanner(IBaggageScanner baggageScanner) {
        this.baggageScanner = baggageScanner;
    }

    public IBaggageSortingUnitRoboter getBaggageSortingUnitRoboter() {
        return baggageSortingUnitRoboter;
    }

    public void setBaggageSortingUnitRoboter(IBaggageSortingUnitRoboter baggageSortingUnitRoboter) {
        this.baggageSortingUnitRoboter = baggageSortingUnitRoboter;
    }

    public BaggageDepot getBaggageDepot() {
        return baggageDepot;
    }

    public void setBaggageDepot(BaggageDepot baggageDepot) {
        this.baggageDepot = baggageDepot;
    }

    public DestinationBox getDestinationBox() {
        return destinationBox;
    }

    public void setDestinationBox(DestinationBox destinationBox) {
        this.destinationBox = destinationBox;
    }

    public ArrayList<LuggageTube> getEmptyLuggageTubeList() {
        return emptyLuggageTubeList;
    }

    public void setEmptyLuggageTubeList(ArrayList<LuggageTube> emptyLuggageTubeList) {
        this.emptyLuggageTubeList = emptyLuggageTubeList;
    }

    public ArrayList<Container> getEmptyContainerList() {
        return emptyContainerList;
    }

    public void setEmptyContainerList(ArrayList<Container> emptyContainerList) {
        this.emptyContainerList = emptyContainerList;
    }

    public ArrayList<Container> getFilledContainerList() {
        return filledContainerList;
    }

    public void setFilledContainerList(ArrayList<Container> filledContainerList) {
        this.filledContainerList = filledContainerList;
    }

    public IBaggageVehicle getBaggageVehicle() {
        return baggageVehicle;
    }

    public void setBaggageVehicle(IBaggageVehicle baggageVehicle) {
        this.baggageVehicle = baggageVehicle;
    }

    public ICustoms getCustoms() {
        return customs;
    }

    public void setCustoms(ICustoms customs) {
        this.customs = customs;
    }
}
