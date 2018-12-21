package Airport.Federal_Police;

import Airport.Base.*;
import Airport.Security_Check.ISecurityCheck;

public class FederalPoliceOfficer {
    private String uuid;
    private int id;
    private String name;
    private Gender gender;
    private IDCard idCard;
    private boolean hasMachineGun;
    private ISecurityCheck securityCheck;

    public boolean verify(Passport passport){
        return false;
    }
    public boolean scan(Passport passport){
        return  false;
    }
    public boolean inspectWeapon(BulkyBaggage specialGood){
        return  false;
    }
    public boolean inspectMunition(BulkyBaggage specialGood){
        return  false;
    }
    public void keepSafe(Baggage baggage){

    }
    public void keepSafe(Item item){

    }
    public void arrest(Passenger passenger){

    }


    public IDCard getIdCard() {
        return idCard;
    }
}
