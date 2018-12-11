package Airport.Checkin_Desk;

import Airport.Airport.GateID;
import Airport.Base.Destination;
import Airport.Base.TicketClass;

import java.util.UUID;

public class CheckInDeskReceipt {
    private String uuid;
    private int checkInDeskId;
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

    public CheckInDeskReceipt(int checkInDeskId, TicketClass ticketClass, String flight, Destination destination, String date, String boardingTime, GateID gateID, int numberOfPassenger, int numberOfNormalBaggage, int numberOfBoardingPass, int numberOfBaggageIdentificationTag){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.checkInDeskId = checkInDeskId;
        this.ticketClass = ticketClass;
        this.flight = flight;
        this.destination = destination;
        this.date = date;
        this.boardingTime = boardingTime;
        this.gateID = gateID;
        this.numberOfBaggageIdentificationTag = numberOfBaggageIdentificationTag;
        this.numberOfBoardingPass = numberOfBoardingPass;
        this.numberOfNormalBaggage = numberOfNormalBaggage;
        this.numberOfPassenger = numberOfPassenger;
    }
}
