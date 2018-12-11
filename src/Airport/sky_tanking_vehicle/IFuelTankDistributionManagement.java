package Airport.sky_tanking_vehicle;

public interface IFuelTankDistributionManagement {
    String version();
    void calculateRequiredAmountOfKerosine();
    void calculateFuelTankDistribution();
}
