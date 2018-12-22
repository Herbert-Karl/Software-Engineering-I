package Airport.Checkin_Desk;



import Airport.Airport.Airport;
import Airport.Airport.GateID;
import Airport.Base.*;
import Airport.Ground_Operations.GroundOperationsCenter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CheckInDeskTest {

    private Airport airport;
    private CheckInDesk checkInDesk;
    private Passenger passenger;
    private BoardingPass boardingPass;
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagList;
    private Baggage baggage;
    private BaggageIdentificationTag baggageIdentificationTag;
    private LuggageTub luggageTub;
    private CheckInDeskReceipt checkInDeskReceipt;
    private GroundOperationsCenter groundOperationsCenter;

    @BeforeEach
    void setUp(){
        groundOperationsCenter = new GroundOperationsCenter();
        checkInDesk = new CheckInDesk(airport);
        passenger = new Passenger();
        baggageIdentificationTagList = new ArrayList<>();
        baggage = new NormalBaggage("content");
        boardingPass = new BoardingPass(Carrier.Emirates,"",passenger,TicketClass.Business,Source.MUC,Destination.HKG,"2012-04-04", GateID.A01,"2h","A1",baggageIdentificationTagList);
        baggageIdentificationTag = new BaggageIdentificationTag(boardingPass,"",5,baggage,"barcode");
        luggageTub = new LuggageTub("barCode","box",baggage);
    }

    @Test
    void open() {
        checkInDesk.open();
        assertTrue(checkInDesk.isOpen());
        assertNotNull(checkInDesk.getEmployee());
    }

    @Test
    void close() {
        checkInDesk.close();
        assertFalse(checkInDesk.isOpen());
        assertNull(checkInDesk.getEmployee());
    }

    @Test
    void validatePassport() {
        assertTrue(checkInDesk.validatePassport(passenger));
    }

    @Test
    void checkIn() {
        assertNotNull(checkInDesk.checkIn(passenger));
    }

    @Test
    void print() {
        checkInDesk.print(boardingPass);
    }

    @Test
    void weight() {
        assertNotNull(checkInDesk.weight(baggage));
    }

    @Test
    void checkIn1() {
        assertNotNull(checkInDesk.checkIn(baggage));
    }

    @Test
    void print1() {
        checkInDesk.print(baggageIdentificationTag);
    }

    @Test
    void place() {
        checkInDesk.place(baggage,luggageTub);
        assertNotNull(luggageTub.getBaggage());
    }

    @Test
    void place1() {
        checkInDesk.place(baggageIdentificationTag,baggage);
    }

    @Test
    void sendLuggageTubToBaggageSortingUnit() {
        checkInDesk.sendLuggageTubToBaggageSortingUnit(luggageTub);
    }

    @Test
    void notifyGroundOperations() {
        checkInDesk.notifyGroundOperations(checkInDeskReceipt);
        assertNotNull(groundOperationsCenter.getCheckInReceiptList());
    }
}