package Airport.Customs;

import Airport.Baggage_Sorting_Unit.Storage.IBaggageSortingUnitRoboter;
import Airport.Base.Baggage;
import Airport.Base.Employee;
import Airport.Base.Item;
import Airport.Scanner.IBaggageScanner;

import java.util.ArrayList;

public interface ICustoms {

  boolean loginBaggageScanner(Employee employee, String password);

  void logoutBaggageScanner();

  boolean scan(Baggage baggage, IBaggageScanner scanner, String pattern);

  void executeRequest(IBaggageSortingUnitRoboter baggageSortingUnitRoboter);

  int handOverBaggageToFederalPolice(
      ArrayList<Baggage> baggageList); //eig handOverToFederalPolice aber Array List erkennt keine verschiedene Elemente

  int handOverItemsToFederalPolice(
      ArrayList<Item> itemList); //eig handOverToFederalPolice aber Array List erkennt keine verschiedene Elemente

  void notifyGroundOperations(CustomsReceipt customsReceipt);
}
