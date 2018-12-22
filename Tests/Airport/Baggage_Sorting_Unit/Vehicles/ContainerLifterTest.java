package Airport.Baggage_Sorting_Unit.Vehicles;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airplane.stowage_cargo.CargoSystem;
import Airplane.stowage_cargo.FrontStowage;
import Airplane.stowage_cargo.FrontStowagePosition;
import Airplane.stowage_cargo.FrontStowagePositionID;
import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.Receipts.BaggageSortingUnitReceipt;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Base.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class ContainerLifterTest {
    private ContainerLifter containerLifter;

    @BeforeEach
    void createContainerLifter() {
        Airport airport = Airport.getInstance();
        airport = null;
        airport = Airport.getInstance();
        airport.build();

        containerLifter = new ContainerLifter("type");
    }

    /**
     * Done
     */
    @Test
    void setGate() {
        Gate gate = new Gate(GateID.A01, null);
        containerLifter.setGate(gate);
        assertEquals(containerLifter.getGate(), gate);
    }

    /**
     * Done
     */
    @Test
    void connectToAirplane() {
        Airplane airplane = new Airplane(new Configuration(4, 50, 50, 50, 10));
        Gate gate = new Gate(GateID.A01, null);
        gate.setAirplane(airplane);
        containerLifter.connectToAirplane();
        assertEquals(containerLifter.getConnectedAirplane(), airplane);
    }

    /**
     * Done
     */
    @Test
    void up() {
        containerLifter.up();
        assertFalse(containerLifter.isDown());
    }

    /**
     * Done
     */
    @Test
    void transferContainerToCargoSystem() {
        Airplane airplane = new Airplane(new Configuration(4, 50, 50, 50, 10));
        Gate gate = new Gate(GateID.A01, null);
        gate.setAirplane(airplane);
        containerLifter.connectToAirplane();

        CargoSystem cargoSystem = airplane.getBody().getCargoSystemArrayList().get(0);
        FrontStowage frontStowage = new FrontStowage();
        cargoSystem.setFrontStowage(frontStowage);

        frontStowage.add_to_positionList(new FrontStowagePosition(FrontStowagePositionID.SFL07,
                new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null, "barCodeIDCatagory",
                        "qrCodeIDCatagory", new Stack<Baggage>())));

        frontStowage.add_to_positionList(new FrontStowagePosition(FrontStowagePositionID.SFR07,
                new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null, "barCodeIDCatagory",
                        "qrCodeIDCatagory", new Stack<Baggage>())));

        Container container = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null, "barCodeIDCatagory",
                "qrCodeIDCatagory", new Stack<Baggage>());

        containerLifter.setContainer(container);
        containerLifter.transferContainerToCargoSystem();

        for (FrontStowagePosition frontStowagePosition : frontStowage.getPositionList()) {
            if (frontStowagePosition.getId() == FrontStowagePositionID.SFL06)
                assertEquals(container, frontStowagePosition.getContainer());
        }
    }

    /**
     * Done
     */
    @Test
    void down() {
        containerLifter.down();
        assertTrue(containerLifter.isDown());
    }

    /**
     * Done
     */
    @Test
    void disconnectFromAirplane() {
        Airplane airplane = new Airplane(new Configuration(4, 50, 50, 50, 10));
        Gate gate = new Gate(GateID.A01, null);
        gate.setAirplane(airplane);
        containerLifter.connectToAirplane();
        assertEquals(containerLifter.getConnectedAirplane(), airplane);

        containerLifter.disconnectFromAirplane();
        assertNull(containerLifter.getConnectedAirplane());
    }

    /**
     * Done
     */
    @Test
    void notifyGroundOperations() {
        ContainerLifterReceipt containerLifterReceipt = new ContainerLifterReceipt("containerLifertID", null,
                10, null);
        containerLifter.notifyGroundOperations(containerLifterReceipt);
        assertTrue(Airport.getInstance().getGroundOperationsCenter().getContainerLifterReceiptList().contains(containerLifterReceipt));
    }

    /**
     * Done
     */
    @Test
    void returnToAirportResourcePool() {
        containerLifter.returnToAirportResourcePool();
        assertTrue(Airport.getInstance().getResourcePool().getContainerLifterList().contains(containerLifter));
    }

    /**
     * Done
     */
    @Test
    void executeRequest() {
        Container container = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null, "barCodeIDCatagory",
                "qrCodeIDCatagory", new Stack<Baggage>());
        containerLifter.setContainer(container);

        containerLifter.executeRequest(GateID.A01);
        assertEquals(Airport.getInstance().getGatefromID(GateID.A01), containerLifter.getGate());
        assertEquals(0, containerLifter.getSpeedInMPH());
        assertFalse(containerLifter.isFlashingLightOn());
        assertNull(containerLifter.getContainer());
        assertTrue(containerLifter.isDown());
        assertNull(containerLifter.getConnectedAirplane());
        for (FrontStowagePosition frontStowagePosition : ((FrontStowage)Airport.getInstance().getGatefromID(GateID.A01).getAirplane().getBody().getCargoSystemArrayList()
                .get(0).getFrontStowage()).getPositionList()) {
            if (frontStowagePosition.getId() == FrontStowagePositionID.SFL07)
                assertEquals(container, frontStowagePosition.getContainer());
        }
        assertTrue(Airport.getInstance().getResourcePool().getContainerLifterList().contains(containerLifter));
    }

    /**
     * Done
     */
    @Test
    void setFlashingLightOn() {
        containerLifter.setFlashingLightOff();
        assertFalse(containerLifter.isFlashingLightOn());
        containerLifter.setFlashingLightOn();
        assertTrue(containerLifter.isFlashingLightOn());
    }

    /**
     * Done
     */
    @Test
    void move() {
        containerLifter.move(50);
        assertEquals(containerLifter.getSpeedInMPH(), 50);
    }

    /**
     * Done
     */
    @Test
    void stop() {
        containerLifter.stop();
        assertEquals(containerLifter.getSpeedInMPH(), 0);
    }

    /**
     * Done
     */
    @Test
    void setFlashingLightOff() {
        containerLifter.setFlashingLightOn();
        assertTrue(containerLifter.isFlashingLightOn());
        containerLifter.setFlashingLightOff();
        assertFalse(containerLifter.isFlashingLightOn());
    }
}