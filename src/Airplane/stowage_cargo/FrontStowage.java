package Airplane.stowage_cargo;

import java.util.ArrayList;

public class FrontStowage extends Stowage {
    private ArrayList<FrontStowagePosition> positionList;

    public FrontStowage(StowageType type, boolean isComplete, ArrayList<FrontStowagePosition> positionList) {
        super(type, isComplete);
        this.positionList = positionList;
    }

    public ArrayList<FrontStowagePosition> getPositionList() {
        return positionList;
    }

    public void setPositionList(ArrayList<FrontStowagePosition> positionList) {
        this.positionList = positionList;
    }
}
