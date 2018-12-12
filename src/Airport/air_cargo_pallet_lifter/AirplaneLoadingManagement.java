package Airport.air_cargo_pallet_lifter;

public class AirplaneLoadingManagement implements IAirplaneLoadingManagement {
    private LoadingStrategy strategy;

    public AirplaneLoadingManagement(LoadingStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void optimizeBalancing() {

    }

    public LoadingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(LoadingStrategy strategy) {
        this.strategy = strategy;
    }
}
