package Airport.Sky_Tanking_Vehicle;

import java.util.ArrayList;

public class FuelTankDistributionManagement implements IFuelTankDistributionManagement {
    private String manufacturer;
    private String type;
    private String id;
    private double maximumDegreeOfFilling;
    private int requiredAmountOfKerosine;
    private ArrayList<FuelTankDistributionRecord> fuelTankDistribution;

    public FuelTankDistributionManagement(String manufacturer, String type, String id, int requiredAmountOfKerosine, ArrayList<FuelTankDistributionRecord> fuelTankDistribution) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.requiredAmountOfKerosine = requiredAmountOfKerosine;
        this.fuelTankDistribution = fuelTankDistribution;
        this.maximumDegreeOfFilling = 0.95;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public double getMaximumDegreeOfFilling() {
        return maximumDegreeOfFilling;
    }

    public int getRequiredAmountOfKerosine() {
        return requiredAmountOfKerosine;
    }

    public ArrayList<FuelTankDistributionRecord> getFuelTankDistribution() {
        return fuelTankDistribution;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMaximumDegreeOfFilling(double maximumDegreeOfFilling) {
        this.maximumDegreeOfFilling = maximumDegreeOfFilling;
    }

    public void setRequiredAmountOfKerosine(int requiredAmountOfKerosine) {
        this.requiredAmountOfKerosine = requiredAmountOfKerosine;
    }

    public void setFuelTankDistribution(ArrayList<FuelTankDistributionRecord> fuelTankDistribution) {
        this.fuelTankDistribution = fuelTankDistribution;
    }

    @Override
    public String version() {
        return "Manufacturer: " + getManufacturer() + ", Type: " + getType() + ", ID: " + getId();
    }

    @Override
    public void calculateRequiredAmountOfKerosene() {
        ArrayList<FuelTankDistributionRecord> temp = getFuelTankDistribution();
        int amount = 0;
        for (FuelTankDistributionRecord tank : temp) {
            amount += tank.getRequiredAmount();
        }
        setRequiredAmountOfKerosine(amount);
    }

    @Override
    public void calculateFuelTankDistribution() {

    }
}
