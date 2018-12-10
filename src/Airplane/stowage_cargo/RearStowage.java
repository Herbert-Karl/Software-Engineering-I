package Airplane.stowage_cargo;

import java.util.ArrayList;

public class RearStowage extends Stowage {

    private ArrayList<RearStowagePosition> positionList;

    // Konstruktor
    //
    RearStowage() {
        super(StowageType.rear); // ruft Konstruktor von Stowage auf
        this.positionList = new ArrayList<RearStowagePosition>();
    }

    protected void add_to_positionList(RearStowagePosition position) {
        if(this.getIsComplete()) { throw new RuntimeException("RearStowage ist bereits vollständig."); }
        boolean alreadyInList = false;
        for( RearStowagePosition element: this.positionList ) {
            if(position.getId() == element.getId()) { alreadyInList = true; }
        }
        if(alreadyInList) { throw new RuntimeException("Position bereits belegt."); }
        this.positionList.add(position);
        if(this.positionList.size() == 7) { this.setIsComplete(true); }
    }

    protected RearStowagePosition remove_from_positionList() {
        if(this.positionList.size() == 0) { return null; }
        return this.positionList.remove(0);
    }

}
