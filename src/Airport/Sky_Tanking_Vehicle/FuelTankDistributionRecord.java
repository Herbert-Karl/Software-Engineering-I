package Airport.Sky_Tanking_Vehicle;

import Airplane.Tanks.IFuelTank;

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

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setFuelTank(IFuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }
}
