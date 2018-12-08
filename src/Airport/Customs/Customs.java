package Airport.Customs;

import Airport.Baggage_Sorting_Unit.IBaggageSortingUnitRoboter;
import Airport.Base.*;
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
        return false;
    }

    public void logoutBaggageScanner(){

    }

    public boolean scan (Baggage baggage, IBaggageScanner scanner, String pattern){
        return false;
    }

    public void executeRequest (IBaggageSortingUnitRoboter baggageSortingUnitRoboter){

    }

    public int handOverBaggageToFederalPolice ( ArrayList<Baggage> baggageList){
        return 0;
    } //eig handOverToFederalPolice aber Array List erkennt keine verschiedene Elemente

    public int handOverItemsToFederalPolice ( ArrayList<Item> itemList ){
        return 0;
    } //eig handOverToFederalPolice aber Array List erkennt keine verschiedene Elemente

    public void notifyGroundOperations (CustomsReceipt customsReceipt){

    }

}
