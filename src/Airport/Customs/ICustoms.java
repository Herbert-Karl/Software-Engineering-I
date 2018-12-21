package Airport.Customs;

import Airport.Base.*;
import Airport.Scanner.IBaggageScanner;
import Airport.Baggage_Sorting_Unit.*;

import java.util.ArrayList;

public interface ICustoms {

    boolean loginBaggageScanner(Employee employee, String password);

    void logoutBaggageScanner();

    boolean scan (Baggage baggage, IBaggageScanner scanner, String pattern);

    void executeRequest (IBaggageSortingUnitRoboter baggageSortingUnitRoboter);

    int handOverBaggageToFederalPolice ( ArrayList<Baggage> baggageList); //eig handOverToFederalPolice aber Array List erkennt keine verschiedene Elemente

    int handOverItemsToFederalPolice ( ArrayList<Item> itemList ); //eig handOverToFederalPolice aber Array List erkennt keine verschiedene Elemente

    void notifyGroundOperations (CustomsReceipt customsReceipt);
}
//comment