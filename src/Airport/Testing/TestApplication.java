package Airport.Testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestApplication {

    private TestAirplane testAirplane;

    @BeforeAll
    public void setup(){
        testAirplane = new TestAirplane(1, "abc", false);
    }

    @Test
    public void test01(){

        assertEquals(testAirplane.id, 3);
    }
}