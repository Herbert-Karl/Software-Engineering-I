package Airport.Customs;

import Airport.Baggage_Sorting_Unit.IBaggageSortingUnitRoboter;
import Airport.Base.*;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.IBaggageScanner;

import java.util.ArrayList;

public class Customs implements ICustoms {
    String uiid;
    CustomsResourcePool resourcePool;
    IBaggageScanner baggageScanner;
    ArrayList<Employee> employeeList;
    ArrayList<Passport> passportList;
    ArrayList<BoardingPass> boardingPassList;
    int numberOfBaggageScanned;
    int numberOfBaggageExcessAmountMoney;
    ArrayList<Baggage> keepSafeBaggageList;
    ArrayList<Item> keepSafeItemList;

    public boolean loginBaggageScanner(Employee employee, String password){
        return BaggageScanner.login(employee.IDCard, password);
    }

    public void logoutBaggageScanner(){
        BaggageScanner.logout();
    }

    public boolean scan (Baggage baggage, IBaggageScanner scanner, String pattern){
        return BaggageScanner.scan(baggage, pattern);
    }

    public void executeRequest (IBaggageSortingUnitRoboter baggageSortingUnitRoboter){

    }

    public int handOverBaggageToFederalPolice ( ArrayList<Baggage> baggageList){
        //foreach baggage in baggage List
        return FederalPolice.keepSafe(baggageList);
    } //eig handOverToFederalPolice aber Array List erkennt keine verschiedene Elemente

    public int handOverItemsToFederalPolice ( ArrayList<Item> itemList ){
        //foreach item in itemList
        return FederalPolice..keepSafe(itemList);
    } //eig handOverToFederalPolice aber Array List erkennt keine verschiedene Elemente

    public void notifyGroundOperations (CustomsReceipt customsReceipt){

    }

}
