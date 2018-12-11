package Airport.sky_tanking_vehicle;

import java.util.ArrayList;

public class FuelTankDistributionManagement implements IFuelTankDistributionManagement {
    private String manufacturer;
    private String type;
    private String id;
    private double maximumDegreeOfFilling;
    private int requiredAmountOfKerosine;
    private ArrayList<FuelTankDistributionRecord> fuelTankDistribution;

    public FuelTankDistributionManagement(String manufacturer, String type, String id, double maximumDegreeOfFilling, int requiredAmountOfKerosine, ArrayList<FuelTankDistributionRecord> fuelTankDistribution) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.maximumDegreeOfFilling = maximumDegreeOfFilling;
        this.requiredAmountOfKerosine = requiredAmountOfKerosine;
        this.fuelTankDistribution = fuelTankDistribution;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void calculateRequiredAmountOfKerosine() {

    }

    @Override
    public void calculateFuelTankDistribution() {

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMaximumDegreeOfFilling() {
        return maximumDegreeOfFilling;
    }

    public void setMaximumDegreeOfFilling(double maximumDegreeOfFilling) {
        this.maximumDegreeOfFilling = maximumDegreeOfFilling;
    }

    public int getRequiredAmountOfKerosine() {
        return requiredAmountOfKerosine;
    }

    public void setRequiredAmountOfKerosine(int requiredAmountOfKerosine) {
        this.requiredAmountOfKerosine = requiredAmountOfKerosine;
    }

    public ArrayList<FuelTankDistributionRecord> getFuelTankDistribution() {
        return fuelTankDistribution;
    }

    public void setFuelTankDistribution(ArrayList<FuelTankDistributionRecord> fuelTankDistribution) {
        this.fuelTankDistribution = fuelTankDistribution;
    }
}
