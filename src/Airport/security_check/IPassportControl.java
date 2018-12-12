package Airport.security_check;

import Airport.base.Passport;

public interface IPassportControl {
    boolean verify(Passport passport);
    boolean scan(Passport passport);
}
