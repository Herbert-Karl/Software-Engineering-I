package Airport.scanner;

import Airport.base.CottonPad;
import Airport.base.Passenger;

public interface IBodyScanner {
    boolean scan(Passenger passenger, String pattern);
    boolean scan(Passenger passenger, CottonPad cottonPad);
}
