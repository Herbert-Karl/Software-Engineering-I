package Airport.Bulky_Baggage_Desk;

import Airport.Base.BoardingPass;
import Airport.Base.Passport;

public interface IReadingDevice {
    String version();
    boolean scan(Passport passport);
    boolean scan(BoardingPass boardingPass);
}
