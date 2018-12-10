package Airport.Sky_Tanking_Vehicle;

import Airplane.Tanks.FuelTank;
import Airplane.Tanks.IFuelTank;
import Airport.Base.AirportFuelTank;

public class FuelPump {
    private boolean isOn;
    private AirportFuelTank connectedAirportFuelTank;
    private IFuelTank connectedFuelTank;

    public FuelPump() {

    }

    public boolean isOn() {
        return isOn;
    }

    public AirportFuelTank getConnectedAirportFuelTank() {
        return connectedAirportFuelTank;
    }

    public IFuelTank getConnectedFuelTank() {
        return connectedFuelTank;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setConnectedAirportFuelTank(AirportFuelTank connectedAirportFuelTank) {
        this.connectedAirportFuelTank = connectedAirportFuelTank;
    }

    public void setConnectedFuelTank(IFuelTank connectedFuelTank) {
        this.connectedFuelTank = connectedFuelTank;
    }

    public void on(){
        if (isOn() == false) {
            setOn(true);
        } else {
            System.out.println("FuelPump Error: already on");
        }
    }

    public void connectAirportFuelTank(AirportFuelTank airportFuelTank) {
        setConnectedAirportFuelTank(airportFuelTank);
    }

    public void connectFuelTank(IFuelTank fuelTank) {
        setConnectedFuelTank(fuelTank);
    }

    public void off() {
        if (isOn() == true) {
            setOn(false);
        } else {
            System.out.println("FuelPump Error: already off");
        }
    }
}
