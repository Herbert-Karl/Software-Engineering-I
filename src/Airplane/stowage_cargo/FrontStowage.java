package Airplane.stowage_cargo;

import java.util.ArrayList;

public class FrontStowage extends Stowage {

    private ArrayList<FrontStowagePosition> positionList;

    // Konstruktor
    //
    FrontStowage() {
        super(StowageType.front); // ruft Konstruktor von Stowage auf
        this.positionList = new ArrayList<FrontStowagePosition>();
    }

    protected void add_to_positionList(FrontStowagePosition position) {
        if(this.getIsComplete()) { throw new RuntimeException("FrontStowage ist bereits vollständig."); }
        boolean alreadyInList = false;
        for( FrontStowagePosition element: this.positionList ) {
            if(position.getId() == element.getId()) { alreadyInList = true; }
        }
        if(alreadyInList) { throw new RuntimeException("Position bereits belegt."); }
        this.positionList.add(position);
        if(this.positionList.size() == 14) { this.setIsComplete(true); }
    }

    protected FrontStowagePosition remove_from_positionList() {
        if(this.positionList.size() == 0) { return null; }
        return this.positionList.remove(0);
    }

}
