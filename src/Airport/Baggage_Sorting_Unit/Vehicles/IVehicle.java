package Airport.Baggage_Sorting_Unit.Vehicles;

public interface IVehicle {

    void executeRequest(Airport.Airport.GateID gateID);

    void setFlashingLightOn();

    void move(int speedInMPH);

    void stop();

    void setGate(Airport.Airport.GateID gate);

    void setFlashingLightOff();
}
