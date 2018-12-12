package Airport.ckeckin_desk;

import Airport.airport.Airport;
import Airport.airport.GateID;
import Airport.base.*;

import java.util.ArrayList;

public class CheckInDesk implements ICheckInDesk {
    private String uuid;
    private int id;
    private Airport airport;
    private TicketClass ticketClass;
    private String flight;
    private Destination destination;
    private String date;
    private String boardingTime;
    private GateID gateID;
    private Employee employee;
    private IReadingDevice readingDevice;
    private ArrayList<LuggageTube> luggageTubeArrayList;
    private Passenger currentPassenger;
    private int numberOfPassenger;
    private int numberOfNormalBaggage;
    private ArrayList<BoardingPass> boardingPassArrayList;
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagArrayList;
    private boolean isOpen;

    public CheckInDesk(String uuid, int id, Airport airport, TicketClass ticketClass, String flight, Destination destination, String date, String boardingTime, GateID gateID, Employee employee, IReadingDevice readingDevice, ArrayList<LuggageTube> luggageTubeArrayList, Passenger currentPassenger, int numberOfPassenger, int numberOfNormalBaggage, ArrayList<BoardingPass> boardingPassArrayList, ArrayList<BaggageIdentificationTag> baggageIdentificationTagArrayList, boolean isOpen) {
        this.uuid = uuid;
        this.id = id;
        this.airport = airport;
        this.ticketClass = ticketClass;
        this.flight = flight;
        this.destination = destination;
        this.date = date;
        this.boardingTime = boardingTime;
        this.gateID = gateID;
        this.employee = employee;
        this.readingDevice = readingDevice;
        this.luggageTubeArrayList = luggageTubeArrayList;
        this.currentPassenger = currentPassenger;
        this.numberOfPassenger = numberOfPassenger;
        this.numberOfNormalBaggage = numberOfNormalBaggage;
        this.boardingPassArrayList = boardingPassArrayList;
        this.baggageIdentificationTagArrayList = baggageIdentificationTagArrayList;
        this.isOpen = isOpen;
    }

    @Override
    public void open() {

    }

    @Override
    public boolean validatePassport(Passenger passenger) {
        return false;
    }

    @Override
    public BoardingPass checkIn(Passenger passenger) {
        return null;
    }

    @Override
    public void print(BoardingPass boardingPass) {

    }

    @Override
    public double weight(Baggage baggage) {
        return 0;
    }

    @Override
    public BaggageIdentificationTag checkIn(Baggage baggage) {
        return null;
    }

    @Override
    public void print(BaggageIdentificationTag baggageIdentificationTag) {

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
    public void notifyGroundOperations(CheckInDeskReceipt checkInDeskReceipt) {

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public TicketClass getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(TicketClass ticketClass) {
        this.ticketClass = ticketClass;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }

    public GateID getGateID() {
        return gateID;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
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

    public int getNumberOfNormalBaggage() {
        return numberOfNormalBaggage;
    }

    public void setNumberOfNormalBaggage(int numberOfNormalBaggage) {
        this.numberOfNormalBaggage = numberOfNormalBaggage;
    }

    public ArrayList<BoardingPass> getBoardingPassArrayList() {
        return boardingPassArrayList;
    }

    public void setBoardingPassArrayList(ArrayList<BoardingPass> boardingPassArrayList) {
        this.boardingPassArrayList = boardingPassArrayList;
    }

    public ArrayList<BaggageIdentificationTag> getBaggageIdentificationTagArrayList() {
        return baggageIdentificationTagArrayList;
    }

    public void setBaggageIdentificationTagArrayList(ArrayList<BaggageIdentificationTag> baggageIdentificationTagArrayList) {
        this.baggageIdentificationTagArrayList = baggageIdentificationTagArrayList;
    }
}
