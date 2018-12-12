package Airport.scanner;

import Airport.base.Baggage;
import Airport.base.CottonPad;

public interface IBaggageScanner {
    boolean scan(Baggage baggage, String pattern);
    boolean scan(Baggage baggage, CottonPad cottonPad);
}
