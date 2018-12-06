package src.Airport.Baggage_Sorting_Unit.Loading;

import Airplane.stowage_cargo.Stowage;

import java.util.ArrayList;

public class LoadingStrategy {

  public ArrayList<String> getAirCargoPalletIDList() {
    return airCargoPalletIDList;
  }

  public void setAirCargoPalletIDList(final ArrayList<String> airCargoPalletIDList) {
    this.airCargoPalletIDList = airCargoPalletIDList;
  }

  public Stowage getStowage() {
    return stowage;
  }

  public void setStowage(final Stowage stowage) {
    this.stowage = stowage;
  }

  private Airplane.stowage_cargo.Stowage stowage;

  private ArrayList<String> airCargoPalletIDList;
}
