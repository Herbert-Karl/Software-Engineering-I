package Airport.Checkin_Desk;

import Airport.Airport.Airport;
import Airport.Airport.GateID;
import Airport.Base.*;

import java.util.UUID;
import java.util.Random;

import static Airport.Base.Destination.HKG;

public class CheckInDesk {
    private String uuid;
    private int id;
    private Airport airport;
    private TicketClass ticketClass;
    private String flight;
    private Destination destination = HKG;
    private String date;
    private String boaringTime;
    private GateID gateID;
    private Employee employee;
    private ReadingDevice readingDevice;
    private ArrayList<LuggageTub> luggageTubList;
    private Passenger currentPassenger;
    private int numberOfPassenger = 0;
    private int numberOfNormalBaggage = 0;
    private ArrayList<BoardingPass> boardingPassList = new ArrayList<>();
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagList;
    private boolean isOpen = false;

    public CheckInDesk(Airport airport){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        Random random = new Random();
        id = random.nextInt(100) + 1;
        this.airport = airport;
        readingDevice = new ReadingDevice();
        luggageTubList = new ArrayList<>();
    }

}
