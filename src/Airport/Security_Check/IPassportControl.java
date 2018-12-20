package Airport.Security_Check;

import Airport.Base.Passport;
import Airport.Federal_Police.FederalPoliceOfficer;

public interface IPassportControl {
    boolean verify(Passport passport);
    boolean scan(Passport passport);
    boolean login(FederalPoliceOfficer federalPoliceOfficer, String password);
    void logout();
}
