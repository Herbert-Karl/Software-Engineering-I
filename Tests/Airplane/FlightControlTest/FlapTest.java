package Airplane.FlightControlTest;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Body;
import Airplane.Aircraft.Configuration;
import Airplane.Aircraft.Wing;
import Airplane.FlightControls.AbstractClasses.VerticalRotable;
import Airplane.FlightControls.Enums.FlapType;
import Airplane.FlightControls.Implementations.Flap;
import Airplane.FlightControls.Interfaces.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FlapTest {
    private Flap flapA350TOInboard, flapA350TOOutboard, flapA350APP, flapA380;

    @BeforeEach
    void setup() {
        flapA350APP = new Flap("FlapHersteller", "type01", FlapType.A350APP);
        flapA350TOInboard = new Flap("FlapHersteller", "type02", FlapType.A350TOInboard);
        flapA350TOOutboard = new Flap("FlapHersteller", "type03", FlapType.A350TOOutboard);
        flapA380 = new Flap("FlapHersteller", "type04", FlapType.A380);

    }


    @Test
    void levelOne() {
        assertEquals(9, flapA350APP.levelOne());
        assertEquals(6, flapA350TOInboard);
        assertEquals(12, flapA350TOOutboard);
        assertEquals(8, flapA380);
    }

    @Test
    void levelTwo() {
        assertEquals(20, flapA350APP.levelTwo());
        assertEquals(20, flapA350TOInboard.levelTwo());
        assertEquals(20, flapA350TOOutboard.levelTwo());
        assertEquals(17, flapA380.levelTwo());
    }

    @Test
    void levelThree() {
        assertEquals(26, flapA350APP.levelThree());
        assertEquals(26, flapA350TOInboard.levelThree());
        assertEquals(26, flapA350TOOutboard.levelThree());
        assertEquals(26, flapA380.levelThree());
    }
}
