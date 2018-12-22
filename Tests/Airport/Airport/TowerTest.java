package Airport.Airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerTest {


    @Test
    void recieveRequestTakeOff() {
        Airplane testairplane = new Airplane();
        assertNotNull(testairplane);                                                        //überprüfen ob airplane nicht null ist
        testairplane = null;
    }

    @Test
    void approveRequestTakeOff() {
        Airplane testairplane = new Airplane;                                               //testairplane erzeugen
        int AirplaneId = testairplane.getID()
        assertEquals("Approve request takeoff for " + AirplaneId, outContent.toString());   //Ausgabe mit tätsächlicher Ausgabe überprüfen
        testairplane = null;                                                                //testairplane wieder löschen
    }

    @Test
    void recieveRequestLanding() {
        assertNotNull(Airplane airplane);                                                   //überprüfen ob airplane nicht null ist
    }

    @Test
    void approveRequestLanding() {
        Airplane testairplane = new Airplane;                                               //testairplane erzeugen
        int AirplaneId = testairplane.getID()
        assertEquals("Approve request landing for " + AirplaneId, outContent.toString());   //Ausgabe mit tätsächlicher Ausgabe überprüfen
        testairplane = null;                                                                //testairplane wieder löschen
    }

    @Test
    void recieveFireAlarm() {
        //Methode noch nicht implementiert
    }

    @Test
    void determineAlarmType() {                                                             //lücken im Code, sollte trotzdem stimmen
        //AlarmTyp A                                                                        //Testen ob bei den ereignissen die richtigen Alarms ausgelöst werden
        Airplane testAirplane = new Airplane();
        airplane.setLeftWing().setEngine().isFire() = 1;                                    //Attribute für AlarmTyp.A setzen
        airplane.setRightWing().setEngine().isFire() = 0;

        assertEquals(AlarmType.A, AlarmType determineAlarmType(testAirplane))               //Alarmtyp mit simuliertem ergebnis gleich?
        testAirplane = null;
        //AlarmTyp B
        Airplane testAirplane = new Airplane();                                             //gleich wie bei A
        airplane.setLeftWing().setEngine().isFire() = 0;
        airplane.setRightWing().setEngine().isFire() = 1;

        assertEquals(AlarmType.B, AlarmType determineAlarmType(testAirplane))
        testAirplane = null;
        //AlarmTyp C
        Airplane testAirplane = new Airplane();                                             //gleich wie bei A
        airplane.setLeftWing().setEngine().isFire() = 1;
        airplane.setRightWing().setEngine().isFire() = 1;

        assertEquals(AlarmType.C, AlarmType determineAlarmType(testAirplane))
        testAirplane = null;

    }

    @Test
    void alarm() {
                //TODO
    }

    @Test
    void getWindDirection() {
        Tower testtower = new Tower();
        WindDirection testwindDirection = testtower.getWindDirection();
        assertnotNUll(testwindDirection);                                                   //überprüfen das Winddirection nicht null ist

    }
}
