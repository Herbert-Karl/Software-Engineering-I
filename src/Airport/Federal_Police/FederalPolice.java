package Airport.Federal_Police;

import Airport.Base.*;
import Airport.Airport.Airport;
import Airport.Airport.Runway;
import Airport.Security_Check.IAutomaticBoardingPassControl;

import java.util.ArrayList;

public class FederalPolice implements IFederalPolice {
    private String uuid;
    private FederalPoliceResourcePool resourcePool;
    private ArrayList<Passenger> arrestedPassenger;
    private ArrayList<Baggage> keepSafeBaggageList;
    private ArrayList<Item> keepSafeItemList;
    private int numberOfWeaponInspected;

    public FederalPolice(FederalPoliceResourcePool resourcePool, ArrayList<Passenger> arrestedPassenger, ArrayList<Baggage> keepSafeBaggageList, ArrayList<Item> keepSafeItemList, int numberOfWeaponInspected, int numberOfMunitionInspected) {
        this.uuid = java.util.UUID.randomUUID().toString();
        this.resourcePool = resourcePool;
        this.arrestedPassenger = arrestedPassenger;
        this.keepSafeBaggageList = keepSafeBaggageList;
        this.keepSafeItemList = keepSafeItemList;
        this.numberOfWeaponInspected = numberOfWeaponInspected;
        this.numberOfMunitionInspected = numberOfMunitionInspected;
    }


    private int numberOfMunitionInspected;

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

    public ArrayList<Passenger> getArrestedPassenger() {
        return arrestedPassenger;
    }

    public void setArrestedPassenger(ArrayList<Passenger> arrestedPassenger) {
        this.arrestedPassenger = arrestedPassenger;
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

    @Override
    public void alarm(IAutomaticBoardingPassControl automaticBoardingPassControl) {
        automaticBoardingPassControl.closeDoors();
    }

    @Override
    public void alarm(Runway runway, AlarmType alarmType) {
        runway.setClearedForTakeOff(false);
        runway.setClearedToLand(false);
    }

    @Override
    public void assignFederalPoliceOfficer(FederalPoliceCar federalPoliceCar, FederalPoliceOfficer federalPoliceOfficer) {
        ArrayList<FederalPoliceOfficer> x = federalPoliceCar.getFederalPoliceOfficerList();
        x.add(federalPoliceOfficer);
        federalPoliceCar.setFederalPoliceOfficerList(x);
    }


    @Override
    public void notifyGroundOperations(FederalPoliceReceipt federalPoliceReceipt) {
        Airport.getInstance().getGroundOperationsCenter().receive(federalPoliceReceipt);
    }
}
