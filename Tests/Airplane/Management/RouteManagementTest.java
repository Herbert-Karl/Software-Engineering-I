package Airplane.Management;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RouteManagementTest extends TestCase {

    private RouteManagement routeManagement;
    private CheckPoint checkPoint;

    @Test
    void version() {

        String id = "id23323";
        String type = "effeef";

        String exp = "<"+id+"> - " + "<"+type+">";
        routeManagement = new RouteManagement("manu", type, id, false, new ArrayList<CheckPoint>(), 7);

        assertEquals(exp, routeManagement.version());
    }

    @Test
    void on() {
        routeManagement.on();
        assertTrue(routeManagement.isOn());
    }

    @Test
    void add() {
        int size = routeManagement.getCheckPointList().size();
        checkPoint = new CheckPoint(0, "dwdw", "fefe", "dwdw");
        assertEquals(size+1, routeManagement.add(checkPoint));
    }

    @Test
    void remove() {
        int size = routeManagement.getCheckPointList().size();
        assertEquals(size-1, routeManagement.remove(checkPoint));
    }

    @Test
    void printCheckPoints() {
    }

    @Test
    void setCostIndex() {
        routeManagement.setCostIndex(3);
        assertEquals(3, routeManagement.getCostIndex());
    }

    @Test
    void off() {
        routeManagement.off();
        assertFalse(routeManagement.isOn());
    }
}