package Airport.customs;

import Airport.baggage_sorting_unit.IBaggageSortingUnitRoboter;
import Airport.base.*;
import Airport.scanner.IBaggageScanner;

import java.util.ArrayList;

public class Customs implements ICustoms {
    private String uuid;
    private CustomsResourcePool resourcePool;
    private IBaggageScanner baggageScanner;
    private ArrayList<Employee> employeeArrayList;
    private ArrayList<Passport> passportArrayList;
    private ArrayList<BoardingPass> boardingPassArrayList;
    private int numberOfBaggageScanned;
    private int numberOfBaggageExcessAmountMoney;
    private ArrayList<Baggage> keepSafeBaggageList;
    private ArrayList<Item> keepSafeItemList;

    public Customs(String uuid, CustomsResourcePool resourcePool, IBaggageScanner baggageScanner, ArrayList<Employee> employeeArrayList, ArrayList<Passport> passportArrayList, ArrayList<BoardingPass> boardingPassArrayList, int numberOfBaggageScanned, int numberOfBaggageExcessAmountMoney, ArrayList<Baggage> keepSafeBaggageList, ArrayList<Item> keepSafeItemList) {
        this.uuid = uuid;
        this.resourcePool = resourcePool;
        this.baggageScanner = baggageScanner;
        this.employeeArrayList = employeeArrayList;
        this.passportArrayList = passportArrayList;
        this.boardingPassArrayList = boardingPassArrayList;
        this.numberOfBaggageScanned = numberOfBaggageScanned;
        this.numberOfBaggageExcessAmountMoney = numberOfBaggageExcessAmountMoney;
        this.keepSafeBaggageList = keepSafeBaggageList;
        this.keepSafeItemList = keepSafeItemList;
    }

    @Override
    public boolean loginBaggageScanner(Employee employee, String password) {
        return false;
    }

    @Override
    public void logoutBaggageScanner() {

    }

    @Override
    public boolean scan(Baggage baggage, IBaggageScanner baggageScanner, String pattern) {
        return false;
    }

    @Override
    public void executeRequest(IBaggageSortingUnitRoboter baggageSortingUnitRoboter) {

    }

    @Override
    public int handOverToFederalPolice(ArrayList<?> ObjectsArrayList) {
        return 0;
    }

    @Override
    public void notifyGroundOperations(CustomsReceipt customsReceipt) {

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public CustomsResourcePool getResourcePool() {
        return resourcePool;
    }

    public void setResourcePool(CustomsResourcePool resourcePool) {
        this.resourcePool = resourcePool;
    }

    public IBaggageScanner getBaggageScanner() {
        return baggageScanner;
    }

    public void setBaggageScanner(IBaggageScanner baggageScanner) {
        this.baggageScanner = baggageScanner;
    }

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    public ArrayList<Passport> getPassportArrayList() {
        return passportArrayList;
    }

    public void setPassportArrayList(ArrayList<Passport> passportArrayList) {
        this.passportArrayList = passportArrayList;
    }

    public ArrayList<BoardingPass> getBoardingPassArrayList() {
        return boardingPassArrayList;
    }

    public void setBoardingPassArrayList(ArrayList<BoardingPass> boardingPassArrayList) {
        this.boardingPassArrayList = boardingPassArrayList;
    }

    public int getNumberOfBaggageScanned() {
        return numberOfBaggageScanned;
    }

    public void setNumberOfBaggageScanned(int numberOfBaggageScanned) {
        this.numberOfBaggageScanned = numberOfBaggageScanned;
    }

    public int getNumberOfBaggageExcessAmountMoney() {
        return numberOfBaggageExcessAmountMoney;
    }

    public void setNumberOfBaggageExcessAmountMoney(int numberOfBaggageExcessAmountMoney) {
        this.numberOfBaggageExcessAmountMoney = numberOfBaggageExcessAmountMoney;
    }

    public ArrayList<Baggage> getKeepSafeBaggageList() {
        return keepSafeBaggageList;
    }

    public void setKeepSafeBaggageList(ArrayList<Baggage> keepSafeBaggageList) {
        this.keepSafeBaggageList = keepSafeBaggageList;
    }

    public ArrayList<Item> getKeepSafeItemList() {
        return keepSafeItemList;
    }

    public void setKeepSafeItemList(ArrayList<Item> keepSafeItemList) {
        this.keepSafeItemList = keepSafeItemList;
    }
}
