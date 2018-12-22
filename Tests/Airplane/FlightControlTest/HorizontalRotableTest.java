package Airplane.FlightControlTest;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Body;
import Airplane.Aircraft.Configuration;
import Airplane.Aircraft.Wing;
import Airplane.FlightControls.AbstractClasses.VerticalRotable;
import Airplane.FlightControls.Interfaces.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HorizontalRotableTest {
    private Configuration configuration;
    private Airplane airplane;
    private Body body;
    private ArrayList<IRudder> rudders;

    @BeforeEach
    void startup() {
        configuration = new Configuration(4, 18, 72, 480, 14);
        airplane = new Airplane(configuration);
        body = new Body(airplane);
        rudders = body.getRudderArrayList();
    }

    @Test
    void left() {
        for (IRudder iRudder : rudders) {
            assertEquals(4, iRudder.left(4));
        }

    }

    @Test
    void right() {
        for (IRudder iRudder : rudders) {
            assertEquals(4, iRudder.right(4));
        }
    }

    @Test
    void fullLeft() {
        for (IRudder iRudder : rudders) {
            assertEquals(45, iRudder.fullLeft());
        }

    }

    @Test
    void fullRight() {
        for (IRudder iRudder : rudders) {
            assertEquals(45, iRudder.fullRight());
        }
    }
}
