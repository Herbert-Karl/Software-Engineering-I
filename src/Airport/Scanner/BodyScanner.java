package Airport.Scanner;

import Airport.Base.CottonPad;
import Airport.Base.Employee;
import Airport.Base.IDCard;
import Airport.Base.Passenger;

import java.util.List;

public class BodyScanner extends AScanner implements IBodyScanner {


    public BodyScanner(String id, String type, StringSearchAlgorithm stringSearchAlgorithm, IReadingDevice readingDevice) {
        super(id, type, stringSearchAlgorithm, readingDevice);
    }

    @Override
    public boolean scan(Passenger passenger, String pattern) {
        if (employee != null) {
            if (stringSearcher.search(passenger.getContent(), pattern)) {
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean scan(Passenger passenger, CottonPad cottonPad) {
        if (employee != null) {
            if (stringSearcher.search(passenger.getContent(), cottonPad.getSurface())) {
                return false;
            }
        }
        return true;
    }
}
