package Airport.federal_police;

import Airport.base.Baggage;
import Airport.base.Item;
import Airport.base.Passenger;

import java.util.ArrayList;

public class FederalPoliceReceipt {
    private String uuid;
    private int numberOfPassportVerified;
    private ArrayList<Passenger> arrestedPassenger;
    private int numberOfKeepSafeBaggage;
    private int numberOfKeepSafeItem;
    private int numberOfWeaponInspected;
    private int numberOfMunitionInspected;

    public FederalPoliceReceipt(String uuid, int numberOfPassportVerified, ArrayList<Passenger> arrestedPassenger, int numberOfKeepSafeBaggage, int numberOfKeepSafeItem, int numberOfWeaponInspected, int numberOfMunitionInspected) {
        this.uuid = uuid;
        this.numberOfPassportVerified = numberOfPassportVerified;
        this.arrestedPassenger = arrestedPassenger;
        this.numberOfKeepSafeBaggage = numberOfKeepSafeBaggage;
        this.numberOfKeepSafeItem = numberOfKeepSafeItem;
        this.numberOfWeaponInspected = numberOfWeaponInspected;
        this.numberOfMunitionInspected = numberOfMunitionInspected;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getNumberOfPassportVerified() {
        return numberOfPassportVerified;
    }

    public void setNumberOfPassportVerified(int numberOfPassportVerified) {
        this.numberOfPassportVerified = numberOfPassportVerified;
    }

    public ArrayList<Passenger> getArrestedPassenger() {
        return arrestedPassenger;
    }

    public void setArrestedPassenger(ArrayList<Passenger> arrestedPassenger) {
        this.arrestedPassenger = arrestedPassenger;
    }

    public int getNumberOfKeepSafeBaggage() {
        return numberOfKeepSafeBaggage;
    }

    public void setNumberOfKeepSafeBaggage(int numberOfKeepSafeBaggage) {
        this.numberOfKeepSafeBaggage = numberOfKeepSafeBaggage;
    }

    public int getNumberOfKeepSafeItem() {
        return numberOfKeepSafeItem;
    }

    public void setNumberOfKeepSafeItem(int numberOfKeepSafeItem) {
        this.numberOfKeepSafeItem = numberOfKeepSafeItem;
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
