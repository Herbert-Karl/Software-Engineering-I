package Airplane.stowage_cargo;

import Airport.Base.*;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class CargoSystemTest extends TestCase {
    private CargoSystem cargoSystem;

    private String manu = "manu232";
    private String type = "type12";
    private String id = "id12212";

    private void initial() {
        cargoSystem = new CargoSystem(manu, type, id);
    }

    @Test
    void version() {
        this.initial();
        String expected = "<" + this.id + "> - <" + this.type + ">";
        assertEquals(expected, this.cargoSystem.version());
    }

    @Test
    void load() {
        this.initial();

        Stack<Baggage> baggageStack = new Stack<>();
        NormalBaggage normalBaggage = new NormalBaggage("content", 100, null);
        baggageStack.push(normalBaggage);

        Container container = new Container(ContainerType.AKE, id, ContainerCategory.Normal, null,
                "barcode", "qrcode", baggageStack);

        double expected = container.getWeight() + cargoSystem.determineTotalWeightContainer();
        cargoSystem.load(container, FrontStowagePositionID.SFL03);
        assertEquals(expected, cargoSystem.determineTotalWeightContainer());
    }

    @Test
    void load1() {

    }

    @Test
    void determineTotalWeightAirCargoPallet() {
    }

    @Test
    void determineTotalWeightContainer() {
    }

    @Test
    void lock() {
    }

    @Test
    void unlock() {
    }

    @Test
    void secure() {
    }

    @Test
    void unloadContainer() {
    }

    @Test
    void unloadAirCargoPallet() {
    }
}