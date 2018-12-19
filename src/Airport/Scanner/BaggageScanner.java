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

    public BaggageScanner(String type, StringSearchAlgorithm stringSearchAlgorithm) {
        super(type, stringSearchAlgorithm, new ReadingDevice(type + " Reader"));
    }

    public Employee getEmployee() {
        return employee;
    }

    public String version() {
        return null;
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
}
