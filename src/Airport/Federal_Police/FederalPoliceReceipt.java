package Airport.Federal_Police;

import Airport.Base.Baggage;
import Airport.Base.Item;
import Airport.Base.Passenger;

import java.util.ArrayList;

public class FederalPoliceReceipt {
    private String uuid;
    private int numberOfPassportVerified;
    private ArrayList arrestedPassenger = new ArrayList<Passenger>();
    private int numberOfKeepSafeBaggage;
    private int numberOfKeepSafeItem;
    private int numberOfWeaponInspected;
    private int numberOfMunitionInspected;
}
