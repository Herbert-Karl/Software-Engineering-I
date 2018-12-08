package Airport.Base;

public class Flight{
    private string id;
    private carrier Carrier;
    private destination Destination;
    private gateID GateID;

    public Flight (string id, carrier Carrier, destination Destination, gateID GateID){
        this.id = id;
        this.carrier = carrier;
        this.destination = destination;
        this.gateID = gateID;
    }
}