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
        if(this.get_isComplete()) { throw new RuntimeException("RearStowage ist bereits vollständig."); }
        boolean alreadyInList = false;
        for( RearStowagePosition element: this.positionList ) {
            if(position.get_id() == element.get_id()) { alreadyInList = true; }
        }
        if(alreadyInList) { throw new RuntimeException("Position bereits belegt."); }
        this.positionList.add(position);
        if(this.positionList.size() == 7) { this.set_isComplete(true); }
    }

    protected RearStowagePosition remove_from_positionList() {
        if(this.positionList.size() == 0) { return null; }
        return this.positionList.remove(0);
    }

}
