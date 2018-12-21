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
        this.initial();

        AirCargoPallet airCargoPallet = new AirCargoPallet("uuid", "type", "id");
        Item[] item = {new Item(0, "Kartoffeln", 100)};
        airCargoPallet.setItemList(item);

        double expected = airCargoPallet.getWeight() + cargoSystem.determineTotalWeightAirCargoPallet();
        cargoSystem.load(airCargoPallet, RearStowagePositionID.SR01);
        assertEquals(expected, cargoSystem.determineTotalWeightAirCargoPallet());
    }

    @Test
    void determineTotalWeightAirCargoPallet() {
        this.initial();
        assertEquals(0, cargoSystem.determineTotalWeightAirCargoPallet());
    }

    @Test
    void determineTotalWeightContainer() {
        this.initial();
        assertEquals(0, cargoSystem.determineTotalWeightAirCargoPallet());
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