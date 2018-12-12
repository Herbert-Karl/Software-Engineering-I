package Airport.security_check;

import Airport.airport.Airport;
import Airport.base.Baggage;
import Airport.base.CottonPad;
import Airport.base.Employee;
import Airport.base.Passenger;
import Airport.federal_police.FederalPolice;
import Airport.federal_police.FederalPoliceOfficer;
import Airport.scanner.IBaggageScanner;
import Airport.scanner.IBodyScanner;
import Airport.scanner.IExplosiveDetector;

import java.util.ArrayList;

public class SecurityCheck implements ISecurityCheck {
    private String uuid;
    private SecurityCheckID id;
    private Airport airport;
    private ArrayList<Employee> employeeArrayList;
    private FederalPoliceOfficer federalPoliceOfficer;
    private ArrayList<String> scanPatternList;
    private IBaggageScanner baggageScanner;
    private IBodyScanner bodyScanner;
    private IExplosiveDetector explosiveDetector;
    private FederalPolice federalPolice;

    public SecurityCheck(String uuid, SecurityCheckID id, Airport airport, ArrayList<Employee> employeeArrayList, FederalPoliceOfficer federalPoliceOfficer, ArrayList<String> scanPatternList, IBaggageScanner baggageScanner, IBodyScanner bodyScanner, IExplosiveDetector explosiveDetector, FederalPolice federalPolice) {
        this.uuid = uuid;
        this.id = id;
        this.airport = airport;
        this.employeeArrayList = employeeArrayList;
        this.federalPoliceOfficer = federalPoliceOfficer;
        this.scanPatternList = scanPatternList;
        this.baggageScanner = baggageScanner;
        this.bodyScanner = bodyScanner;
        this.explosiveDetector = explosiveDetector;
        this.federalPolice = federalPolice;
    }

    @Override
    public boolean loginBaggageScanner(Employee employee, String password) {
        return false;
    }

    @Override
    public void logoutBaggageScanner() {

    }

    @Override
    public boolean loginBodyScanner(Employee employee, String password) {
        return false;
    }

    @Override
    public void logoutBodyScanner() {

    }

    @Override
    public boolean loginExplosivesDetector(Employee employee, String password) {
        return false;
    }

    @Override
    public void logoutExplosivesDetector() {

    }

    @Override
    public boolean scan(Passenger passenger, String pattern) {
        return false;
    }

    @Override
    public boolean scan(Passenger passenger, CottonPad cottonPad) {
        return false;
    }

    @Override
    public boolean scan(Baggage baggage, String pattern) {
        return false;
    }

    @Override
    public boolean scan(Baggage baggage, CottonPad cottonPad) {
        return false;
    }

    @Override
    public void notifyGroundOperations(SecurityCheckReceipt securityCheckReceipt) {

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public SecurityCheckID getId() {
        return id;
    }

    public void setId(SecurityCheckID id) {
        this.id = id;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    public FederalPoliceOfficer getFederalPoliceOfficer() {
        return federalPoliceOfficer;
    }

    public void setFederalPoliceOfficer(FederalPoliceOfficer federalPoliceOfficer) {
        this.federalPoliceOfficer = federalPoliceOfficer;
    }

    public ArrayList<String> getScanPatternList() {
        return scanPatternList;
    }

    public void setScanPatternList(ArrayList<String> scanPatternList) {
        this.scanPatternList = scanPatternList;
    }

    public IBaggageScanner getBaggageScanner() {
        return baggageScanner;
    }

    public void setBaggageScanner(IBaggageScanner baggageScanner) {
        this.baggageScanner = baggageScanner;
    }

    public IBodyScanner getBodyScanner() {
        return bodyScanner;
    }

    public void setBodyScanner(IBodyScanner bodyScanner) {
        this.bodyScanner = bodyScanner;
    }

    public IExplosiveDetector getExplosiveDetector() {
        return explosiveDetector;
    }

    public void setExplosiveDetector(IExplosiveDetector explosiveDetector) {
        this.explosiveDetector = explosiveDetector;
    }

    public FederalPolice getFederalPolice() {
        return federalPolice;
    }

    public void setFederalPolice(FederalPolice federalPolice) {
        this.federalPolice = federalPolice;
    }
}
