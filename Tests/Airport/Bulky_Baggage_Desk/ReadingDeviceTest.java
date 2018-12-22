package Airport.Bulky_Baggage_Desk;

import Airport.Airport.GateID;
import Airport.Base.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReadingDeviceTest {
    private ReadingDevice readingDevice;
    private Passport passport;
    private BoardingPass boardingPass;
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagList;


    @BeforeEach
    void setUp() {
        baggageIdentificationTagList = new ArrayList<>();
        readingDevice = new ReadingDevice("type");
        passport = new Passport("","",new Passenger());
        boardingPass = new BoardingPass(Carrier.Emirates,"flug",new Passenger(), TicketClass.Business, Source.MUC, Destination.HKG,"2012-04-04", GateID.A01,"2h","A1",baggageIdentificationTagList);
    }

    @Test
    void version() {
    }

    @Test
    void scan() {
        assertFalse(readingDevice.scan(passport));
    }

    @Test
    void scan1() {
        assertTrue((readingDevice.scan(boardingPass)));
    }
}