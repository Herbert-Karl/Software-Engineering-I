package Airport.ckeckin_desk;

import Airport.base.Passport;

public interface IReadingDevice {
    String version();
    boolean scan(Passport passport);
}
