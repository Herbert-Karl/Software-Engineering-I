package Airport.Baggage_Sorting_Unit.Loading;

public class AirplaneLoadingManagement implements IAirplaneLoadingManagementt {

  public LoadingStrategy getStrategy() {
    return strategy;
  }

  private final LoadingStrategy strategy;

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
