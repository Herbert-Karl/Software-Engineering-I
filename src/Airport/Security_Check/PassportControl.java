package Airport.Security_Check;

import Airport.Base.Passport;
import Airport.Federal_Police.FederalPoliceOfficer;
import Airport.Scanner.IReadingDevice;

import java.util.List;

public class PassportControl implements IPassportControl {

    private String uuid;
    private String id;
    private FederalPoliceOfficer federalPoliceOfficer;
    private IReadingDevice readingDevice;
    private List<Passport> passportList;

    public PassportControl(String uuid, String id, IReadingDevice readingDevice) {
        this.uuid = uuid;
        this.id = id;
        this.readingDevice = readingDevice;
    }

    @Override
    public boolean verify(Passport passport) {
        return false;
    }

    @Override
    public boolean scan(Passport passport) {
        return false;
    }
}

