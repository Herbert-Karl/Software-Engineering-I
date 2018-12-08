package Airport.Security_Check;

import Airport.Base.Passport;
import Airport.Scanner.IReadingDevice;

import java.util.List;

public class PassportControl implements IPassportControl {

    private String uuid;
    private String id;
    private FederalPoliceOfficer federalPoliceOfficer;
    private IReadingDevice readingDevice;
    private List<Passport> passportList;

    @Override
    public boolean verify(Passport passport) {
        return false;
    }

    @Override
    public boolean scan(Passport passport) {
        return false;
    }
}
