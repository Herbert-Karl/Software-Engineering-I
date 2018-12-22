package Airplane.stowage_cargo;

import Airport.Base.*;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StowageNumberFiveTest extends TestCase {
    private Container container;
    private StowageNumberFive stowageNumberFive;

    @Test
    void load() {
        stowageNumberFive = new StowageNumberFive();
        Stack<Baggage> baggageStack = new Stack<>();
        NormalBaggage normalBaggage = new NormalBaggage("content", 100, null);
        baggageStack.push(normalBaggage);

        container = new Container(ContainerType.AKH, "id", ContainerCategory.Normal, null,
                "barcode", "qrcode", baggageStack);

        assertTrue(stowageNumberFive.load(container));
        assertFalse(stowageNumberFive.load(container));
    }

    @Test
    void weightOfStowageNumberFive() {
        assertEquals(container.getWeight(), stowageNumberFive.weightOfStowageNumberFive());
    }

    @Test
    void unload() {
        assertEquals(container, stowageNumberFive.unload());
        assertEquals(null, stowageNumberFive.unload());
    }

}