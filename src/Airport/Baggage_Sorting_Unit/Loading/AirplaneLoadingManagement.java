package Airport.Baggage_Sorting_Unit.Loading;

public class AirplaneLoadingManagement implements Airport.Baggage_Sorting_Unit.Loading.IAirplaneLoadingManagementt {

  public Airport.Baggage_Sorting_Unit.Loading.LoadingStrategy getStrategy() {
    return strategy;
  }

  private Airport.Baggage_Sorting_Unit.Loading.LoadingStrategy strategy;

  public AirplaneLoadingManagement(final Airport.Baggage_Sorting_Unit.Loading.LoadingStrategy strategy) {
    this.strategy = strategy;
  }

  public AirplaneLoadingManagement() {
    strategy = new Airport.Baggage_Sorting_Unit.Loading.LoadingStrategy();
  }

  /**
   * TODO: Optimizes the loading strategy
   */
  @Override
  public void optimizeBalancing() {

  }
}
