package Airport.AirCargoPalletLifter;

public class AirplaneLoadingManagment implements IAirplaneLoadingManagement{
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
    @Override
    public void optimizeBalancing(){}
}
