package Airport.Security_Check;

import Airport.Base.Passport;

public interface IPassportControl {
    boolean verify(Passport passport);
    boolean scan(Passport passport);
}
