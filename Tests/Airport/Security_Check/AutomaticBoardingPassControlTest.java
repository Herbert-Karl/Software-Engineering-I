package Airport.Security_Check;

import Airport.Airport.GateID;
import Airport.Base.*;
import Airport.Federal_Police.FederalPolice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBoardingPassControlTest {
    private AutomaticBoardingPassControl automaticBoardingPassControl;
    private FederalPolice federalPolice;
    private BoardingPass boardingPass;
    private Passenger passenger;
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagList;

    @BeforeEach
    void setUp() {
        baggageIdentificationTagList = new ArrayList<>();
        passenger = new Passenger();
        federalPolice = new FederalPolice();
        automaticBoardingPassControl = new AutomaticBoardingPassControl(AutomaticBoardingPassControlID.ABC_02,federalPolice);
        boardingPass = new BoardingPass(Carrier.Emirates,"flug",passenger, TicketClass.Business, Source.MUC, Destination.HKG,"2012-04-04", GateID.A01,"2h","A1",baggageIdentificationTagList);

    }

    @Test
    void openDoors() {
        assertTrue(automaticBoardingPassControl.openDoors());
    }

    @Test
    void closeDoors() {
        assertFalse(automaticBoardingPassControl.closeDoors());
    }

    @Test
    void scan() {
        assertTrue(automaticBoardingPassControl.scan(boardingPass));
        boardingPass = new BoardingPass(Carrier.Emirates,null,passenger,TicketClass.Business,Source.MUC,Destination.HKG,"2012-04-04", GateID.A01,"2h","A1",baggageIdentificationTagList);
        assertFalse(automaticBoardingPassControl.scan(boardingPass));
    }

    @Test
    void alarm() {
    }
}