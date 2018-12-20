package Airport.Baggage_Sorting_Unit.Loading;

import Airport.Base.Container;

import java.util.ArrayList;

public class AirplaneLoadingManagement implements IAirplaneLoadingManagement {

    public LoadingStrategy getStrategy() {
        return strategy;
    }

    private final LoadingStrategy strategy;

    public AirplaneLoadingManagement(final LoadingStrategy strategy) {
        this.strategy = strategy;
    }

    public AirplaneLoadingManagement(ArrayList<Container> containers) {
        strategy = new LoadingStrategy();
    }

    /**
     * TODO: Optimizes the loading strategy
     */
    @Override
    public void optimizeBalancing() {
    }

}
