package Airport.base;

import Airport.airport.GateID;

import java.util.ArrayList;

public class BoardingPass {
    private String uuid;
    private Carrier carrier;
    private String flight;
    private Passenger passenger;
    private TicketClass ticketClass;
    private Source source;
    private Destination destination;
    private String date;
    private GateID gateID;
    private String boardingTime;
    private String seat;
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagArrayList;

    public BoardingPass(String uuid, Carrier carrier, String flight, Passenger passenger, TicketClass ticketClass, Source source, Destination destination, String date, GateID gateID, String boardingTime, String seat, ArrayList<BaggageIdentificationTag> baggageIdentificationTagArrayList) {
        this.uuid = uuid;
        this.carrier = carrier;
        this.flight = flight;
        this.passenger = passenger;
        this.ticketClass = ticketClass;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.gateID = gateID;
        this.boardingTime = boardingTime;
        this.seat = seat;
        this.baggageIdentificationTagArrayList = baggageIdentificationTagArrayList;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public TicketClass getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(TicketClass ticketClass) {
        this.ticketClass = ticketClass;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
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

    public GateID getGateID() {
        return gateID;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public String getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public ArrayList<BaggageIdentificationTag> getBaggageIdentificationTagArrayList() {
        return baggageIdentificationTagArrayList;
    }

    public void setBaggageIdentificationTagArrayList(ArrayList<BaggageIdentificationTag> baggageIdentificationTagArrayList) {
        this.baggageIdentificationTagArrayList = baggageIdentificationTagArrayList;
    }
}
