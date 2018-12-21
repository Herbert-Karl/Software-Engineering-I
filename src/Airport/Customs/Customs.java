package Airport.Customs;

import Airport.Baggage_Sorting_Unit.IBaggageSortingUnitRoboter;
import Airport.Base.*;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.IBaggageScanner;
import Airport.Federal_Police.*;
import Airport.Ground_Operations.*;

import java.util.ArrayList;
import java.util.UUID;

public class Customs implements ICustoms {
    private String uiid;
    private CustomsResourcePool resourcePool;
    private IBaggageScanner baggageScanner;
    private ArrayList<Employee> employeeList;
    private ArrayList<Passport> passportList;
    private ArrayList<BoardingPass> boardingPassList;
    private int numberOfBaggageScanned;
    private int numberOfBaggageExcessAmountMoney;
    private ArrayList<Baggage> keepSafeBaggageList;
    private ArrayList<Item> keepSafeItemList;
    private Federal_Police federalPolice;

    public Customs(CustomsResourcePool resourcePool, IBaggageScanner baggageScanner, ArrayList<Employee> employeeList, ArrayList<Passport> passportList, ArrayList<BoardingPass> boardingPassList, int numberOfBaggageScanned, int numberOfBaggageExcessAmountMoney, ArrayList<Baggage> keepSafeBaggageList, ArrayList<Item> keepSafeItemList) {
        this.uiid = java.util.UUID.randomUUID().toString();
        this.resourcePool = resourcePool;
        this.baggageScanner = baggageScanner;
        this.employeeList = employeeList;
        this.passportList = passportList;
        this.boardingPassList = boardingPassList;
        this.numberOfBaggageScanned = numberOfBaggageScanned;
        this.numberOfBaggageExcessAmountMoney = numberOfBaggageExcessAmountMoney;
        this.keepSafeBaggageList = keepSafeBaggageList;
        this.keepSafeItemList = keepSafeItemList;
    }

    Ground_Operations_Center groundOperationsCenter;

    public boolean loginBaggageScanner(Employee employee, String password){
        return baggageScanner.login(employee.IDCard, password);
    }

    public void logoutBaggageScanner(){
        baggageScanner.logout();
    }

    public boolean scan (Baggage baggage, IBaggageScanner scanner, String pattern){
        return baggageScanner.scan(baggage, pattern);
    }

    public void executeRequest (IBaggageSortingUnitRoboter baggageSortingUnitRoboter){
        //?????????????????????????
    }

    public int handOverBaggageToFederalPolice ( ArrayList<Baggage> baggageList){
        for (Baggage baggage : baggageList){
            federalPolice.keepSafe(baggage);
        }
        return baggageList.size();
    } //eig handOverToFederalPolice aber Array List erkennt keine verschiedene Elemente

    public int handOverItemsToFederalPolice ( ArrayList<Item> itemList ){
        for (Item item :itemList ) {
            federalPolice.keepSafe(item);
        }
        return itemList.size();
    } //eig handOverToFederalPolice aber Array List erkennt keine verschiedene Elemente

    public void notifyGroundOperations (CustomsReceipt customsReceipt){
        ArrayList<CustomsReceipt> tmpArray = new ArrayList<>();
        tmpArray.add(customsReceipt);
        groundOperationsCenter.customsReceiptList(tmpArray);
    }

}
