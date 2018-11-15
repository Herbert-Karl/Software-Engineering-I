package stowage_cargo;

import java.util.ArrayList;

public class FrontStowage extends Stowage {

    private ArrayList<FrontStowagePosition> positionList;

    // Konstruktor
    //
    FrontStowage() {
        super(StowageType.front); // ruft Konstruktor von Stowage auf
        this.positionList = new ArrayList<FrontStowagePosition>();
    }

}
