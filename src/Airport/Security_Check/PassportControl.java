package Airport.Security_Check;

import Airport.Base.Passport;
import Airport.Federal_Police.FederalPoliceOfficer;
import Airport.Scanner.IReadingDevice;
import Airport.Scanner.ReadingDevice;

import java.util.List;
import java.util.UUID;

public class PassportControl implements IPassportControl {

    private String uuid;
    private String id;
    private FederalPoliceOfficer federalPoliceOfficer;
    private IReadingDevice readingDevice;
    private List<Passport> passportList;

    public PassportControl(String id) {
        this.uuid = UUID.randomUUID().toString();
        this.id = id;
        this.readingDevice = new ReadingDevice( "PassportControl Reader");
    }

    @Override
    public boolean login(FederalPoliceOfficer federalPoliceOfficer, String password) {
        if (federalPoliceOfficer.getIdCard().getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logout() {
        federalPoliceOfficer = null;
    }

    @Override
    public boolean verify(Passport passport) {
        return federalPoliceOfficer.verify(passport);
    }

    @Override
    public boolean scan(Passport passport) {
        passportList.add(passport);
        return federalPoliceOfficer.scan(passport);
    }
}

