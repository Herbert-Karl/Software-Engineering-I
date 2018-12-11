package Airport.sky_tanking_vehicle;

import Airplane.tank_bottle.IFuelTank;
import Airport.base.AirportFuelTank;

public class FuelPump {
    private boolean isOn;
    private AirportFuelTank airportFuelTank;
    private IFuelTank fuelTank;

    public FuelPump(boolean isOn, AirportFuelTank airportFuelTank, IFuelTank fuelTank) {
        this.isOn = isOn;
        this.airportFuelTank = airportFuelTank;
        this.fuelTank = fuelTank;
    }

    public void on() {

    }

    public void off() {

    }

    public void pump(int amount) {

    }

    public void connectAirportFuelTank(AirportFuelTank airportFuelTank) {

    }

    public void connectFuelTank(IFuelTank fuelTank) {

    }
}
