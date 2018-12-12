package Airport.bulky_baggage_desk;

import Airport.airport.Airport;
import Airport.base.*;

import java.util.ArrayList;

public class BulkyBaggageDesk implements IBulkyBaggageDesk {
    private String uuid;
    private String id;
    private Airport airport;
    private Employee employee;
    private IReadingDevice readingDevice;
    private ArrayList<LuggageTube> luggageTubeArrayList;
    private Passenger currentPassenger;
    private int numberOfPassenger;
    private int numberOfBulkyBaggage;
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagArrayList;
    private boolean isOpen;

    public BulkyBaggageDesk(String uuid, String id, Airport airport, Employee employee, IReadingDevice readingDevice, ArrayList<LuggageTube> luggageTubeArrayList, Passenger currentPassenger, int numberOfPassenger, int numberOfBulkyBaggage, ArrayList<BaggageIdentificationTag> baggageIdentificationTagArrayList, boolean isOpen) {
        this.uuid = uuid;
        this.id = id;
        this.airport = airport;
        this.employee = employee;
        this.readingDevice = readingDevice;
        this.luggageTubeArrayList = luggageTubeArrayList;
        this.currentPassenger = currentPassenger;
        this.numberOfPassenger = numberOfPassenger;
        this.numberOfBulkyBaggage = numberOfBulkyBaggage;
        this.baggageIdentificationTagArrayList = baggageIdentificationTagArrayList;
        this.isOpen = isOpen;
    }

    @Override
    public void open() {

    }

    @Override
    public boolean scan(Passport passport) {
        return false;
    }

    @Override
    public boolean scan(BoardingPass boardingPass) {
        return false;
    }

    @Override
    public double weight(Baggage baggage) {
        return 0;
    }

    @Override
    public BaggageIdentificationTag checkIn(BoardingPass boardingPass, Baggage baggage) {
        return null;
    }

    @Override
    public BaggageIdentificationTag print() {
        return null;
    }

    @Override
    public void place(BaggageIdentificationTag baggageIdentificationTag, Baggage baggage) {

    }

    @Override
    public void place(Baggage baggage, LuggageTube luggageTube) {

    }

    @Override
    public void sendLuggageTubeToBaggageSortingUnit(LuggageTube luggageTube) {

    }

    @Override
    public void refillLuggageTubeListFromCheckInDesk() {

    }

    @Override
    public void notifyGroundOperations(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt) {

    }

    @Override
    public void close() {

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public IReadingDevice getReadingDevice() {
        return readingDevice;
    }

    public void setReadingDevice(IReadingDevice readingDevice) {
        this.readingDevice = readingDevice;
    }

    public ArrayList<LuggageTube> getLuggageTubeArrayList() {
        return luggageTubeArrayList;
    }

    public void setLuggageTubeArrayList(ArrayList<LuggageTube> luggageTubeArrayList) {
        this.luggageTubeArrayList = luggageTubeArrayList;
    }

    public Passenger getCurrentPassenger() {
        return currentPassenger;
    }

    public void setCurrentPassenger(Passenger currentPassenger) {
        this.currentPassenger = currentPassenger;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfBulkyBaggage() {
        return numberOfBulkyBaggage;
    }

    public void setNumberOfBulkyBaggage(int numberOfBulkyBaggage) {
        this.numberOfBulkyBaggage = numberOfBulkyBaggage;
    }

    public ArrayList<BaggageIdentificationTag> getBaggageIdentificationTagArrayList() {
        return baggageIdentificationTagArrayList;
    }

    public void setBaggageIdentificationTagArrayList(ArrayList<BaggageIdentificationTag> baggageIdentificationTagArrayList) {
        this.baggageIdentificationTagArrayList = baggageIdentificationTagArrayList;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
