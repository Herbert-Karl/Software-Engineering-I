package Airport.sky_tanking_vehicle;

import Airplane.tank_bottle.IFuelTank;

public class FuelTankDistributionRecord {
    private IFuelTank fuelTank;
    private int requiredAmount;

    public FuelTankDistributionRecord(IFuelTank fuelTank, int requiredAmount) {
        this.fuelTank = fuelTank;
        this.requiredAmount = requiredAmount;
    }

    public IFuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(IFuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }
}
