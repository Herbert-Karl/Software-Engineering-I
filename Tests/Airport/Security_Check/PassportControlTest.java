package Airport.Security_Check;

import Airport.Base.Passenger;
import Airport.Base.Passport;
import Airport.Federal_Police.FederalPoliceOfficer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassportControlTest {
    private PassportControl passportControl;
    private FederalPoliceOfficer federalPoliceOfficer;
    private Passport passport;

    @BeforeEach
    void setUp() {
        passportControl = new PassportControl("Control");
        federalPoliceOfficer = new FederalPoliceOfficer();
        passport = new Passport("","",new Passenger());
    }

    @Test
    void login() {
        assertTrue(passportControl.login(federalPoliceOfficer,"Right"));
        assertFalse(passportControl.login(federalPoliceOfficer,"wrong"));
    }

    @Test
    void logout() {
        passportControl.logout();
        assertNull(passportControl.getFederalPoliceOfficer());
    }

    @Test
    void verify() {
        assertFalse(passportControl.verify(passport));
    }

    @Test
    void scan() {
        assertFalse(passportControl.scan(passport));
    }
}