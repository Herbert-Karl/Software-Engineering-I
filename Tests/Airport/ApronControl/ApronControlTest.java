package Airport.ApronControl;

import Airport.Airport.*;
import Airport.fire_department.FireDepartment;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ApronControlTest {



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
        Airplane airplane;
        assertEquals(RunwayCheckPointID.S1, apronControl.requestRunwayCheckPointID(airplane));
    }

    @Test
    void search() {
        TaxiCenterLine taxiCenterLine = TaxiCenterLine.yellow;
        GateID gateID = GateID.A04;
        RunwayID runwayID = RunwayID.R08L;
        ArrayList<TaxiCheckPoint> taxiCheckPointList = new ArrayList <TaxiCheckPoint> ();
        for ( int i = 6; i >= 4; i-- ) {
            String checkPoint = "O" + Integer.toString(i);
            taxiCheckPointList.add(TaxiCheckPoint.valueOf(checkPoint));
        }
        RunwayCheckPointID runwayCheckPoint = RunwayCheckPointID.S2;
        TaxiWay taxiWayShouldReturn = new TaxiWay(TaxiCenterLine.yellow,GateID.A04,RunwayID.R08L,taxiCheckPointList,runwayCheckPoint);


        assertEquals(taxiWayShouldReturn, apronControl.search(TaxiCenterLine.yellow,GateID.A04,RunwayID.R08L));


    }

    @Test
    void approveRequestTaxi() {
        Airplane airplane;
        TaxiWay taxiWay;
        assertTrue(apronControl.approveRequestTaxi(airplane, taxiWay));

    }

}
