package src.Airport.Baggage_Sorting_Unit;


public class AirplaneLoadingManagement implements IAirplaneLoadingManagementt {

    public LoadingStrategy getStrategy() {
        return strategy;
    }

    private LoadingStrategy strategy;

    public AirplaneLoadingManagement(final LoadingStrategy strategy) {
        this.strategy = strategy;
    }
    public AirplaneLoadingManagement() {
        strategy = new LoadingStrategy();
    }

    /**
     * TODO: Optimizes the loading strategy
     */
    @Override
    public void optimizeBalancing() {

    }

}
