package Airport.Federal_Police;

import Airport.Base.*;
import Airport.Security_Check.ISecurityCheck;
import Airport.Security_Check.PassportControl;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

public class FederalPoliceOfficer {
    private FederalPolice federalPolice;
    private String uuid;
    private String id;
    private String name;
    private Gender gender;
    private IDCard idCard;
    private boolean hasMachineGun;
    private ISecurityCheck securityCheck;
    Random rnd = new Random();
    public FederalPoliceOfficer(String name, Gender gender, IDCard idCard, boolean hasMachineGun, ISecurityCheck securityCheck) {
        this.uuid = java.util.UUID.randomUUID().toString();
        this.id = "" + (rnd.nextInt(100000)+1);
        this.name = name;
        this.gender = gender;
        this.idCard = idCard;
        this.hasMachineGun = hasMachineGun;
        this.securityCheck = securityCheck;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }

    public boolean isHasMachineGun() {
        return hasMachineGun;
    }

    public void setHasMachineGun(boolean hasMachineGun) {
        this.hasMachineGun = hasMachineGun;
    }

    public ISecurityCheck getSecurityCheck() {
        return securityCheck;
    }

    public void setSecurityCheck(ISecurityCheck securityCheck) {
        this.securityCheck = securityCheck;
    }

    public boolean verify(Passport passport){
        PassportControl pc = new PassportControl(id);
        if(!pc.verify(passport)){
            arrest(passport.getPassenger());
        return true;
        }
        else
            return false;

    }
    public boolean scan(Passport passport){
        PassportControl pc = new PassportControl(id);
        if(pc.scan(passport)){
            return verify(passport);
        }
        else
            return false;
    }
    public boolean inspectWeapon(BulkyBaggage bulkyBaggage){
        if( Pattern.compile(Pattern.quote("glock7"), Pattern.CASE_INSENSITIVE).matcher(bulkyBaggage.getContent()).find() |
                Pattern.compile(Pattern.quote("drugs"), Pattern.CASE_INSENSITIVE).matcher(bulkyBaggage.getContent()).find() |
                Pattern.compile(Pattern.quote("knife"), Pattern.CASE_INSENSITIVE).matcher(bulkyBaggage.getContent()).find() |
                Pattern.compile(Pattern.quote("exp!os!ve"), Pattern.CASE_INSENSITIVE).matcher(bulkyBaggage.getContent()).find()){
            keepSafe(bulkyBaggage);
            return true;
        }
        else
            return false;
    }
    public boolean inspectMunition(BulkyBaggage bulkyBaggage){
        if(Pattern.compile(Pattern.quote("munition"),Pattern.CASE_INSENSITIVE).matcher(bulkyBaggage.getContent()).find()){
            keepSafe(bulkyBaggage);
            return true;
        }
        else
            return false;
    }
    public void keepSafe(Baggage baggage){
        ArrayList<Baggage> baggageArrayList = new ArrayList<>();
        baggageArrayList = federalPolice.getKeepSafeBaggageList();
        baggageArrayList.add(baggage);
        federalPolice.setKeepSafeBaggageList(baggageArrayList);
    }
    public void keepSafe(Item item){

        ArrayList<Item> itemArrayList = new ArrayList<>();
        itemArrayList = federalPolice.getKeepSafeItemList();
        itemArrayList.add(item);
        federalPolice.setKeepSafeItemList(itemArrayList);
    }
    public void arrest(Passenger passenger){
        ArrayList<Passenger> passengerArrayList = new ArrayList<>();
        passengerArrayList = federalPolice.getArrestedPassenger();
        passengerArrayList.add(passenger);
        federalPolice.setArrestedPassenger(passengerArrayList);
    }
}


















