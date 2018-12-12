package Airport.bulky_baggage_desk;

import Airport.base.BoardingPass;
import Airport.base.Passport;

public interface IReadingDevice {
    String version();
    boolean scan(Passport passport);
    boolean scan(BoardingPass boardingPass);
}
