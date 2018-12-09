package Airport.AirCargoPalletLifter;

public class AirplaneLoadingManagment {
    private LoadingStrategy strategy;

    public AirplaneLoadingManagment(LoadingStrategy strategy) {
        this.strategy = strategy;
    }

    public LoadingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(LoadingStrategy strategy) {
        this.strategy = strategy;
    }
    public void optimizeBalancing(){}
}
