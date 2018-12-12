package Airport.ckeckin_desk;

import Airport.airport.GateID;
import Airport.base.Destination;
import Airport.base.TicketClass;

public class CheckInDeskReceipt {
    private String uuid;
    private int checkInDeskID;
    private TicketClass ticketClass;
    private String flight;
    private Destination destination;
    private String date;
    private String boardingTime;
    private GateID gateID;
    private int numberOfPassenger;
    private int numberOfNormalBaggage;
    private int numberOfBoardingPass;
    private int numberOfBaggageIdentificationTag;

    public CheckInDeskReceipt(String uuid, int checkInDeskID, TicketClass ticketClass, String flight, Destination destination, String date, String boardingTime, GateID gateID, int numberOfPassenger, int numberOfNormalBaggage, int numberOfBoardingPass, int numberOfBaggageIdentificationTag) {
        this.uuid = uuid;
        this.checkInDeskID = checkInDeskID;
        this.ticketClass = ticketClass;
        this.flight = flight;
        this.destination = destination;
        this.date = date;
        this.boardingTime = boardingTime;
        this.gateID = gateID;
        this.numberOfPassenger = numberOfPassenger;
        this.numberOfNormalBaggage = numberOfNormalBaggage;
        this.numberOfBoardingPass = numberOfBoardingPass;
        this.numberOfBaggageIdentificationTag = numberOfBaggageIdentificationTag;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getCheckInDeskID() {
        return checkInDeskID;
    }

    public void setCheckInDeskID(int checkInDeskID) {
        this.checkInDeskID = checkInDeskID;
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

    public int getNumberOfBoardingPass() {
        return numberOfBoardingPass;
    }

    public void setNumberOfBoardingPass(int numberOfBoardingPass) {
        this.numberOfBoardingPass = numberOfBoardingPass;
    }

    public int getNumberOfBaggageIdentificationTag() {
        return numberOfBaggageIdentificationTag;
    }

    public void setNumberOfBaggageIdentificationTag(int numberOfBaggageIdentificationTag) {
        this.numberOfBaggageIdentificationTag = numberOfBaggageIdentificationTag;
    }
}
