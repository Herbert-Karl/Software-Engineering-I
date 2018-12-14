package Airport.Scanner;

import Airport.Base.Baggage;
import Airport.Base.CottonPad;
import Airport.Base.Employee;
import Airport.Base.IDCard;

import java.util.List;

public class BaggageScanner extends AScanner implements IBaggageScanner {

    String uuid;
    String id;
    String type;
    StringSearchAlgorithm stringSearchAlgorithm;
    List<Employee> registeredEmployeeList;
    IReadingDevice readingDevice;
    Employee employee;

    public BaggageScanner(String id, String type, StringSearchAlgorithm stringSearchAlgorithm, IReadingDevice readingDevice) {
        super(id, type, stringSearchAlgorithm, readingDevice);
    }


    @Override
    public boolean scan(Baggage baggage, String pattern) {
        if (employee != null) {
            if (stringSearcher.search(baggage.getContent(), pattern)) {
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean scan(Baggage baggage, CottonPad cottonPad) {
        if (employee != null) {
            if (stringSearcher.search(baggage.getContent(), cottonPad.getSurface())) {
                return false;
            }
        }
        return true;
    }
}

