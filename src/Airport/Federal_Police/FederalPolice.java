package Airport.Federal_Police;

import Airport.Airport.Runway;
import Airport.Base.AlarmType;
import Airport.Base.Baggage;
import Airport.Base.Item;
import Airport.Base.Passenger;
import Airport.Security_Check.IAutomaticBoardingPassControl;

import java.util.ArrayList;

public class FederalPolice implements IFederalPolice {
    private String uuid;
    private FederalPoliceResourcePool resourcePool;
    private ArrayList arrestedPassengers = new ArrayList<Passenger>();
    private ArrayList keepSafeBaggageList = new ArrayList<Baggage>();
    private ArrayList keepSafeItemList = new ArrayList<Item>();
    private int numberOfWeaponInspected;
    private int numberOfMunitionInspected;

    @Override
    public void alarm(Runway runway, AlarmType alarmType) {

    }

    @Override
    public void alarm(IAutomaticBoardingPassControl automaticBoardingPassControl) {

    }

    @Override
    public void assignFederalPoliceOfficer(IFederalPoliceCar federalPoliceCar) {

    }

    @Override
    public void receive(ArrayList<Baggage> baggageList) {

    }

    @Override
    public void notifyGroundOperations(FederalPoliceReceipt federalPoliceReceipt) {

    }
}
