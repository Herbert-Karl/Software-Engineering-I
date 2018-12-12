package Airport.federal_police;

import Airport.airport.Runway;
import Airport.base.AlarmType;
import Airport.base.Baggage;
import Airport.base.Item;
import Airport.base.Passenger;
import Airport.security_check.IAutomaticBoardingPassControl;

import java.util.ArrayList;

public class FederalPolice implements IFederalPolice {
    private String uuid;
    private FederalPoliceResourcePool resourcePool;
    private ArrayList<Passenger> arrestedPassengers;
    private ArrayList<Baggage> keepSafeBaggageList;
    private ArrayList<Item> keepSafeItemList;
    private int numberOfWeaponInspected;
    private int numberOfMunitionInspected;

    public FederalPolice(String uuid, FederalPoliceResourcePool resourcePool, ArrayList<Passenger> arrestedPassengers, ArrayList<Baggage> keepSafeBaggageList, ArrayList<Item> keepSafeItemList, int numberOfWeaponInspected, int numberOfMunitionInspected) {
        this.uuid = uuid;
        this.resourcePool = resourcePool;
        this.arrestedPassengers = arrestedPassengers;
        this.keepSafeBaggageList = keepSafeBaggageList;
        this.keepSafeItemList = keepSafeItemList;
        this.numberOfWeaponInspected = numberOfWeaponInspected;
        this.numberOfMunitionInspected = numberOfMunitionInspected;
    }

    @Override
    public void alarm(IAutomaticBoardingPassControl automaticBoardingPassControl) {

    }

    @Override
    public void alarm(Runway runway, AlarmType alarmType) {

    }

    @Override
    public void assignFederalPoliceOfficer(IFederalPoliceCar federalPoliceCar) {

    }

    @Override
    public void receive(ArrayList<Baggage> baggageArrayList) {

    }

    @Override
    public void notifyGroundOperations(FederalPoliceReceipt federalPoliceReceipt) {

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public FederalPoliceResourcePool getResourcePool() {
        return resourcePool;
    }

    public void setResourcePool(FederalPoliceResourcePool resourcePool) {
        this.resourcePool = resourcePool;
    }

    public ArrayList<Passenger> getArrestedPassengers() {
        return arrestedPassengers;
    }

    public void setArrestedPassengers(ArrayList<Passenger> arrestedPassengers) {
        this.arrestedPassengers = arrestedPassengers;
    }

    public ArrayList<Baggage> getKeepSafeBaggageList() {
        return keepSafeBaggageList;
    }

    public void setKeepSafeBaggageList(ArrayList<Baggage> keepSafeBaggageList) {
        this.keepSafeBaggageList = keepSafeBaggageList;
    }

    public ArrayList<Item> getKeepSafeItemList() {
        return keepSafeItemList;
    }

    public void setKeepSafeItemList(ArrayList<Item> keepSafeItemList) {
        this.keepSafeItemList = keepSafeItemList;
    }

    public int getNumberOfWeaponInspected() {
        return numberOfWeaponInspected;
    }

    public void setNumberOfWeaponInspected(int numberOfWeaponInspected) {
        this.numberOfWeaponInspected = numberOfWeaponInspected;
    }

    public int getNumberOfMunitionInspected() {
        return numberOfMunitionInspected;
    }

    public void setNumberOfMunitionInspected(int numberOfMunitionInspected) {
        this.numberOfMunitionInspected = numberOfMunitionInspected;
    }
}
