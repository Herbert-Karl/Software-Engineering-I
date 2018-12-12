package Airport.customs;

import Airport.baggage_sorting_unit.IBaggageSortingUnitRoboter;
import Airport.base.Baggage;
import Airport.base.Employee;
import Airport.base.Item;
import Airport.scanner.IBaggageScanner;

import java.util.ArrayList;

public interface ICustoms {
    boolean loginBaggageScanner(Employee employee, String password);
    void logoutBaggageScanner();
    boolean scan(Baggage baggage, IBaggageScanner baggageScanner, String pattern);
    void executeRequest(IBaggageSortingUnitRoboter baggageSortingUnitRoboter);
    int handOverToFederalPolice(ArrayList<?> ObjectsArrayList);
    void notifyGroundOperations(CustomsReceipt customsReceipt);
}
