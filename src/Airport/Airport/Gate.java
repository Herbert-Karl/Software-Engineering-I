package Airport.Airport;

import Airplane.Aircraft.Airplane;
import Airport.Base.Flight;

public class Gate{
    private GateID gateID;
    private Flight flight;
    private boolean isOpen;
    private Airplane airplane;

    public Gate(GateID gateID, Flight flight){
        this.gateID = gateID;
        this.flight = flight;
        this.isOpen = false;
        this.airplane = null;
    }

    public Gate(){}

    public GateID getGateID() {
        return gateID;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public boolean open(){
        isOpen = airplane != null;
        return isOpen;
    }

    public boolean connect(Airplane airplane){
        if(airplane != null){
            return false;
        }
        else{
            this.airplane = airplane;
            return true;
        }
    }

    public void disconnectAirplane(){
        airplane = null;
    }

    public void close(){
        isOpen = false;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
}