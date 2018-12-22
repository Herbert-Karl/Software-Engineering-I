package Airport.Security_Check;

import Airport.Airport.Airport;
import Airport.Airport.GateID;
import Airport.Base.*;
import Airport.Scanner.IReadingDevice;
import Airport.Scanner.ReadingDevice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBoardingPassControlDeskTest {
    private Employee employee;
    private Airport airport;
    private AutomaticBoardingPassControlDesk automaticBoardingPassControlDesk;
    private BoardingPass boardingPass;
    private Passenger passenger;
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagList;

    @BeforeEach
    void setUp(){
        automaticBoardingPassControlDesk = new AutomaticBoardingPassControlDesk();
        employee = airport.getResourcePool().takeResource("Employee");
        passenger = new Passenger();
        baggageIdentificationTagList = new ArrayList<>();
        boardingPass = new BoardingPass(Carrier.Emirates,"flug",passenger,TicketClass.Business,Source.MUC,Destination.HKG,"2012-04-04", GateID.A01,"2h","A1",baggageIdentificationTagList);


    }

    @Test
    void login() {
        assertTrue(automaticBoardingPassControlDesk.login(employee));
        assertFalse(automaticBoardingPassControlDesk.login(employee));
    }

    @Test
    void logout() {
        automaticBoardingPassControlDesk.logout();
        assertNull(automaticBoardingPassControlDesk.getEmployee());
    }

    @Test
    void scan() {
        assertTrue(automaticBoardingPassControlDesk.scan(boardingPass));
        boardingPass = new BoardingPass(Carrier.Emirates,null,passenger,TicketClass.Business,Source.MUC,Destination.HKG,"2012-04-04", GateID.A01,"2h","A1",baggageIdentificationTagList);
        assertFalse(automaticBoardingPassControlDesk.scan(boardingPass));
    }
}