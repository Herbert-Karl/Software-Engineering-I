package Airport.Airport;

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

    public boolean open(){
        isOpen = airplane = !null;
        return isOpen;
    }

    public boolean connect(Airplane airplane){
        if(airplane =! null){
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
}