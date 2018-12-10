package Airplane.stowage_cargo;

import java.util.ArrayList;

public class RearStowage extends Stowage {
    ArrayList<RearStowagePosition> positionList;

    public RearStowage(StowageType type, boolean isComplete, ArrayList<RearStowagePosition> positionList) {
        super(type, isComplete);
        this.positionList = positionList;
    }

    public ArrayList<RearStowagePosition> getPositionList() {
        return positionList;
    }

    public void setPositionList(ArrayList<RearStowagePosition> positionList) {
        this.positionList = positionList;
    }
}
