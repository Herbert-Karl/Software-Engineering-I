package Airplane.stowage_cargo;

import Airport.base.Container;

import java.util.ArrayList;

public class FrontStowage extends Stowage {
    private ArrayList<FrontStowagePosition> positionList;

    public FrontStowage(StowageType type, boolean isComplete, ArrayList<FrontStowagePosition> positionList) {
        super(type, isComplete);
        this.positionList = positionList;
    }

    public ArrayList<Container> unloadAll() {
        ArrayList<Container> output = new ArrayList<>();
        this.positionList.forEach(e -> {
            if (e.getContainer() != null) {
                output.add(e.getContainer());
                e.setContainer(null);
            }
        });

        return output;
    }
    
    public boolean load(FrontStowagePosition frontStowagePosition) {
        if (!this.isComplete()) {
            this.positionList.forEach(e -> {
                if (e.getId() == frontStowagePosition.getId() && e.getContainer() == null) {
                    e.setContainer(frontStowagePosition.getContainer());
                }
            });
            return true;
        }
        
        return false;
    }

    public ArrayList<FrontStowagePosition> getPositionList() {
        return positionList;
    }

    public void setPositionList(ArrayList<FrontStowagePosition> positionList) {
        this.positionList = positionList;
    }
}
