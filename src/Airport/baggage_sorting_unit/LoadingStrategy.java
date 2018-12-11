package Airport.baggage_sorting_unit;

import Airplane.stowage_cargo.Stowage;

import java.util.ArrayList;

public class LoadingStrategy {
    private Stowage stowage;
    private ArrayList<String> airCargoPalletIDList;

    public LoadingStrategy(Stowage stowage, ArrayList<String> airCargoPalletIDList) {
        this.stowage = stowage;
        this.airCargoPalletIDList = airCargoPalletIDList;
    }

    public Stowage getStowage() {
        return stowage;
    }

    public void setStowage(Stowage stowage) {
        this.stowage = stowage;
    }

    public ArrayList<String> getAirCargoPalletIDList() {
        return airCargoPalletIDList;
    }

    public void setAirCargoPalletIDList(ArrayList<String> airCargoPalletIDList) {
        this.airCargoPalletIDList = airCargoPalletIDList;
    }
}
