package stowage_cargo;

import java.util.ArrayList;

public class Stowage {

    private StowageType type;

    private static int maximumNumberOfContainer = 14;

    private static int maximumNumberOfAirCargoPallets = 7;

    private ArrayList<Container> containerList;

    private ArrayList<AirCargoPallet> airCargoPalletList;

    //private boolean isComplete;

    // Konstruktor
    //
    Stowage(StowageType type) {
        this.type = type;
        this.containerList = new ArrayList<Container>();
        this.airCargoPalletList = new ArrayList<AirCargoPallet>();
        //this.isComplete = false;
    }
}
