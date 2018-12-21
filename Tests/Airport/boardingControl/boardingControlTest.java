package Airport.boardingControl;

import Airport.Airport.GateID;
import Airport.Base.*;
import Airport.Boarding_Control.BoardingControl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class boardingControlTest {

    @Test
    void inspect1() {
        Passenger passenger = new Passenger();
        Passport passport = new Passport("1","2",passenger);
        BoardingControl boardingControl = new BoardingControl();
        assertEquals(true, boardingControl.inspect(passport));
    }
}