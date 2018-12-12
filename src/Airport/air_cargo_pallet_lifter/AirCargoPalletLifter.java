package Airport.air_cargo_pallet_lifter;

import Airplane.Aircraft.Airplane;
import Airport.airport.Airport;
import Airport.airport.Gate;
import Airport.airport.GateID;
import Airport.base.AirCargoPallet;
import Airport.service_vehicle.Vehicle;

import java.util.ArrayList;

public class AirCargoPalletLifter extends Vehicle implements IAirCargoPalletLifter {
    private boolean isDown;
    private AirCargoPallet airCargoPallet;
    private int numberOfAirCargoPalletLoaded;
    private ArrayList<String> airCargoPalletIDList;

    public AirCargoPalletLifter(String uuid, String type, String id, int speedInMPH, boolean isFlashingLightOn, Gate gate, Airplane connectedAirplane, Airport airport, boolean isDown, AirCargoPallet airCargoPallet, int numberOfAirCargoPalletLoaded, ArrayList<String> airCargoPalletIDList) {
        super(uuid, type, id, speedInMPH, isFlashingLightOn, gate, connectedAirplane, airport);
        this.isDown = isDown;
        this.airCargoPallet = airCargoPallet;
        this.numberOfAirCargoPalletLoaded = numberOfAirCargoPalletLoaded;
        this.airCargoPalletIDList = airCargoPalletIDList;
    }

    @Override
    public void executeRequest(GateID gateID) {

    }

    @Override
    public void setFlashingLightOn() {

    }

    @Override
    public void move(int speedInMPH) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void setGate(GateID gateID) {

    }

    @Override
    public void connectToAirplane() {

    }

    @Override
    public void up() {

    }

    @Override
    public void transferAirCargoPalletToCargoSystem() {

    }

    @Override
    public void down() {

    }

    @Override
    public void disconnectFromAirplane() {

    }

    @Override
    public void setFlashingLightOff() {

    }

    @Override
    public void notifyGroundOperations(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt) {

    }

    @Override
    public void returnToAirportResourcePool() {

    }

    public boolean isDown() {
        return isDown;
    }

    public void setDown(boolean down) {
        isDown = down;
    }

    public AirCargoPallet getAirCargoPallet() {
        return airCargoPallet;
    }

    public void setAirCargoPallet(AirCargoPallet airCargoPallet) {
        this.airCargoPallet = airCargoPallet;
    }

    public int getNumberOfAirCargoPalletLoaded() {
        return numberOfAirCargoPalletLoaded;
    }

    public void setNumberOfAirCargoPalletLoaded(int numberOfAirCargoPalletLoaded) {
        this.numberOfAirCargoPalletLoaded = numberOfAirCargoPalletLoaded;
    }

    public ArrayList<String> getAirCargoPalletIDList() {
        return airCargoPalletIDList;
    }

    public void setAirCargoPalletIDList(ArrayList<String> airCargoPalletIDList) {
        this.airCargoPalletIDList = airCargoPalletIDList;
    }
}
