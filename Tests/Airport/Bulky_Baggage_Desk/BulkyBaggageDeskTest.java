package Airport.Bulky_Baggage_Desk;

import Airport.Airport.GateID;
import Airport.Base.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BulkyBaggageDeskTest {
    private Baggage baggage;
    private BulkyBaggageDesk bulkyBaggageDesk;
    private Passport passport;
    private BoardingPass boardingPass;
    private LuggageTub luggageTub;
    private BaggageIdentificationTag baggageIdentificationTag;
    private BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt;
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagList;

    @BeforeEach
    void setUp(){
        bulkyBaggageDeskReceipt = new BulkyBaggageDeskReceipt(1,1,1,1);
        baggage = new NormalBaggage("content");
        luggageTub = new LuggageTub("code","box",baggage);
        baggageIdentificationTagList = new ArrayList<>();
        bulkyBaggageDesk = new BulkyBaggageDesk();
        passport = new Passport("","",new Passenger());
        boardingPass = new BoardingPass(Carrier.Emirates,"flug",new Passenger(), TicketClass.Business, Source.MUC, Destination.HKG,"2012-04-04", GateID.A01,"2h","A1",baggageIdentificationTagList);
        baggageIdentificationTag = new BaggageIdentificationTag(boardingPass,"",5,baggage,"barcode");
    }

    @Test
    void open() {
        bulkyBaggageDesk.open();
        assertTrue(bulkyBaggageDesk.isOpen());
        assertNotNull(bulkyBaggageDesk.getEmployee());
    }

    @Test
    void close() {
        bulkyBaggageDesk.close();
        assertFalse(bulkyBaggageDesk.isOpen());
        assertNull(bulkyBaggageDesk.getEmployee());
    }

    @Test
    void weight() {
        bulkyBaggageDesk.weight(baggage);
        assertNotNull(baggage.getWeight());
    }

    @Test
    void scan() {
        assertTrue(bulkyBaggageDesk.scan(passport));
    }

    @Test
    void scan1() {
        assertTrue(bulkyBaggageDesk.scan(boardingPass));
    }

    @Test
    void checkIn() {
        assertNotNull(bulkyBaggageDesk.checkIn(boardingPass,baggage));
    }

    @Test
    void printBaggageIdentificationTag() {
        assertNotNull(bulkyBaggageDesk.printBaggageIdentificationTag());
    }

    @Test
    void place() {
        bulkyBaggageDesk.place(baggage,luggageTub);
        assertNotNull(luggageTub.getBaggage());
    }

    @Test
    void place1() {
        bulkyBaggageDesk.place(baggageIdentificationTag,baggage);
    }

    @Test
    void sendLuggageTubToBaggageSortingUnit() {
        bulkyBaggageDesk.sendLuggageTubToBaggageSortingUnit(luggageTub);

    }

    @Test
    void refillLuggageTubListFromCheckInDesk() {

    }

    @Test
    void notifyGroundOperations() {
        bulkyBaggageDesk.notifyGroundOperations(bulkyBaggageDeskReceipt);
    }
}