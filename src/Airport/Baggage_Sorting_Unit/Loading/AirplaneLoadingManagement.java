package Airport.Baggage_Sorting_Unit.Loading;

import Airplane.Aircraft.Airplane;
import Airplane.stowage_cargo.FrontStowage;
import Airplane.stowage_cargo.Stowage;
import Airport.Airport.Airport;

public class AirplaneLoadingManagement implements IAirplaneLoadingManagement {

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
