package Airport.federal_police;

import Airport.base.*;
import Airport.security_check.ISecurityCheck;

public class FederalPoliceOfficer extends Employee {
    private boolean hasMachineGun;
    private ISecurityCheck securityCheck;

    public FederalPoliceOfficer(String uuid, int id, String name, Gender gender, IDCard idCard, boolean hasMachineGun, ISecurityCheck securityCheck) {
        super(uuid, id, name, gender, idCard);
        this.hasMachineGun = hasMachineGun;
        this.securityCheck = securityCheck;
    }

    public boolean verify(Passport passport) {
        return false;
    }

    public boolean scan(Passport passport) {
        return false;
    }

    public boolean inspectWeapon(BulkyBaggage bulkyBaggage) {
        return false;
    }

    public boolean inspectMunition(BulkyBaggage bulkyBaggage) {
        return false;
    }

    public void keepSafe(Baggage baggage) {

    }

    public void keepSafe(Item item) {

    }

    public void arrest(Passenger passenger) {

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
}
