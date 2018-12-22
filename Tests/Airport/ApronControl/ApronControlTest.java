package Airport.ApronControl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApronControlTest {

    private  passengerTicket = new Ticket();
    private ApronControl apronControl = new ApronControl();

    @Test
    void approveRequestStartEngines() {
        Airplane airplane;
        assertTrue(apronControl.approveRequestStartEngines(airplane));
    }

    @Test
    void approveRequestPushback() {
        Airplane airplane;
        assertTrue(apronControl.approveRequestPushback(airplane));
    }

    @Test
    void requestRunwayCheckPointID() {
        //Methode hat noch nichts definiert definiert
    }

    @Test
    void search() {



    }

    @Test
    void approveRequestTaxi() {
        //Methode hat noch nichts definiert definiert
    }

}
