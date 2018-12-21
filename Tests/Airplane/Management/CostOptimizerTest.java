package Airplane.Management;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CostOptimizerTest extends TestCase {
    private CostOptimizer costOptimizer;

    @Test
    void version() {
        String id = "id223923";
        String type = "type82398239";
        costOptimizer = new CostOptimizer("manu", type, id, false, new ArrayList<CheckPoint>(), 3);
        String exp = "<"+id+"> - " + "<"+type+">";
        assertEquals(exp, costOptimizer.version());
    }

    @Test
    void on() {
        costOptimizer.on();
        assertTrue(costOptimizer.isOn());
    }

    @Test
    void add() {
        int size = costOptimizer.getCheckPointList().size();

        CheckPoint checkPoint = new CheckPoint(3, "Checki", "lati", "long");

        assertEquals(size+1, costOptimizer.add(checkPoint));
        assertEquals(checkPoint, costOptimizer.getCheckPointList().get(size+1));
    }

    @Test
    void remove() {
        int size = costOptimizer.getCheckPointList().size();
        assertEquals(size-1, costOptimizer.remove(size-1));
    }

    @Test
    void optimize() {
        //TODO
    }

    @Test
    void validate() {
        for (int i =1; i <= 5; i++) {
            assertTrue(costOptimizer.validate(i));
        }
    }

    @Test
    void off() {
        costOptimizer.off();
        assertFalse(costOptimizer.isOn());
    }
}