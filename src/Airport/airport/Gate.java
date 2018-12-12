package Airport.airport;

import Airplane.Aircraft.Airplane;
import Airport.base.Flight;

public class Gate {
    private GateID gateID;
    private Flight flight;
    private boolean isOpen;
    private Airplane airplane;

    public Gate(GateID gateID, Flight flight, boolean isOpen, Airplane airplane) {
        this.gateID = gateID;
        this.flight = flight;
        this.isOpen = isOpen;
        this.airplane = airplane;
    }

    public void open() {

    }

    public void close() {

    }

    public void connect(Airplane airplane) {

    }

    public void disconnect() {

    }

    public GateID getGateID() {
        return gateID;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
