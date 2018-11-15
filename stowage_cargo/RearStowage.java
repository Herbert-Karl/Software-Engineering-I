package stowage_cargo;

import java.util.ArrayList;

public class RearStowage extends Stowage {

    private ArrayList<RearStowagePosition> positionList;

    // Konstruktor
    //
    RearStowage() {
        super(StowageType.rear); // ruft Konstruktor von Stowage auf
        this.positionList = new ArrayList<RearStowagePosition>();
    }

}
