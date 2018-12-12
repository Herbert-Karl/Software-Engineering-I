package Airport.airport;

import Airplane.Aircraft.Airplane;
import Airport.base.Flight;
import Airport.base.Passenger;
import Airport.bulky_baggage_desk.IBulkyBaggageDesk;
import Airport.ckeckin_desk.CheckInMediator;
import Airport.ground_operations.IGroundOperationsCenter;
import Airport.security_check.SecurityMediator;

import java.util.ArrayList;

public class Airport {
    private ArrayList<Passenger> passengerArrayList;
    private AirportResourcePool resourcePool;
    private ArrayList<Gate> gateArrayList;
    private Apron apron;
    private IGroundOperationsCenter groundOperationsCenter;
    private CheckInMediator checkInMediator;
    private IBulkyBaggageDesk bulkyBaggageDesk;
    private SecurityMediator securityMediator;
    private ApronControl apronControl;
    private Tower tower;

    public Airport() {
    }

    public void buildAirport() {

    }

    public int loadPassengerBaggageData(String dataFilePath) {
        return 0;
    }

    public boolean connectAirplane(Airplane airplane, Gate gate) {
        return false;
    }

    public boolean disconnectAirplane(Airplane airplane, Gate gate) {
        return false;
    }

    public boolean executeServiceVehicleWasteWater(GateID gateID) {
        return false;
    }

    public boolean executeCheckIn(Flight flight) {
        return false;
    }

    public boolean executeSecurity() {
        return false;
    }

    public boolean executeCustoms() {
        return false;
    }

    public boolean executeAirCargo(GateID gateID) {
        return false;
    }

    public boolean executeBaggageSortingUnit(GateID gateID) {
        return false;
    }

    public boolean executeServiceVehicleBase(GateID gateID) {
        return false;
    }

    public boolean executeServiceVehicleFreshWater(GateID gateID) {
        return false;
    }

    public boolean executeServiceVehicleNitrogenOxygen(GateID gateID) {
        return false;
    }

    public boolean executeSkyTanking(GateID gateID) {
        return false;
    }

    public boolean executeBoardingControl(GateID gateID) {
        return false;
    }

    public boolean executePushBack(GateID gateID) {
        return false;
    }

    public void executeGroundOperationsLogging() {

    }

    public ArrayList<Passenger> getPassengerArrayList() {
        return passengerArrayList;
    }

    public void setPassengerArrayList(ArrayList<Passenger> passengerArrayList) {
        this.passengerArrayList = passengerArrayList;
    }

    public AirportResourcePool getResourcePool() {
        return resourcePool;
    }

    public void setResourcePool(AirportResourcePool resourcePool) {
        this.resourcePool = resourcePool;
    }

    public ArrayList<Gate> getGateArrayList() {
        return gateArrayList;
    }

    public void setGateArrayList(ArrayList<Gate> gateArrayList) {
        this.gateArrayList = gateArrayList;
    }

    public Apron getApron() {
        return apron;
    }

    public void setApron(Apron apron) {
        this.apron = apron;
    }

    public IGroundOperationsCenter getGroundOperationsCenter() {
        return groundOperationsCenter;
    }

    public void setGroundOperationsCenter(IGroundOperationsCenter groundOperationsCenter) {
        this.groundOperationsCenter = groundOperationsCenter;
    }

    public CheckInMediator getCheckInMediator() {
        return checkInMediator;
    }

    public void setCheckInMediator(CheckInMediator checkInMediator) {
        this.checkInMediator = checkInMediator;
    }

    public IBulkyBaggageDesk getBulkyBaggageDesk() {
        return bulkyBaggageDesk;
    }

    public void setBulkyBaggageDesk(IBulkyBaggageDesk bulkyBaggageDesk) {
        this.bulkyBaggageDesk = bulkyBaggageDesk;
    }

    public SecurityMediator getSecurityMediator() {
        return securityMediator;
    }

    public void setSecurityMediator(SecurityMediator securityMediator) {
        this.securityMediator = securityMediator;
    }

    public ApronControl getApronControl() {
        return apronControl;
    }

    public void setApronControl(ApronControl apronControl) {
        this.apronControl = apronControl;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }
}
