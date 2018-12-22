package Airplane.Management;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airport.Base.Gender;
import Airport.Base.Passenger;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SeatManagementTest extends TestCase {

    private SeatManagement seatManagement;

    @Test
    void version() {
        String id = "22322";
        String type = "3232";

        String exp = "<"+id+"> - " + "<"+type+">" ;

        seatManagement = new SeatManagement("manu", type, id);
        assertEquals(exp, seatManagement.version());
    }

    @Test
    void countAvailableSeat() {
        Airplane airplane = new Airplane(new Configuration(3));
        int exp = airplane.getBody().getFirstClassSeatArrayList().size() + airplane.getBody().getBusinessClassSeatArrayList().size() + airplane.getBody().getTouristClassSeatArrayList().size();
        assertEquals(exp, seatManagement.countAvailableSeat(airplane));
    }

    @Test
    void assign() {
        ArrayList<Passenger> passengers = new ArrayList<>();
        assertFalse(seatManagement.assign(passengers));
    }

    @Test
    void countAvailableSeat1() {
        Airplane airplane = new Airplane(new Configuration(3));
        int exp = airplane.getBody().getFirstClassSeatArrayList().size() + airplane.getBody().getBusinessClassSeatArrayList().size() + airplane.getBody().getTouristClassSeatArrayList().size();
        assertEquals(0, seatManagement.countAvailableSeat("9428492849", airplane));
    }

    @Test
    void searchSeatByPassengerName() {
        assertEquals(0, seatManagement.searchSeatByPassengerName("").size());
    }

    @Test
    void searchPassengerBySeatID() {
        assertEquals(0, seatManagement.searchPassengerBySeatID("").size());
    }

}