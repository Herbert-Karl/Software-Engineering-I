package Airplane.stowage_cargo;

import Airport.base.AirCargoPallet;

import java.util.ArrayList;

public class RearStowage extends Stowage {
    private ArrayList<RearStowagePosition> positionList;

    public RearStowage(StowageType type, boolean isComplete, ArrayList<RearStowagePosition> positionList) {
        super(type, isComplete);
        this.positionList = positionList;
    }

    public ArrayList<AirCargoPallet> unloadAll() {
        ArrayList<AirCargoPallet> output = new ArrayList<>();
        this.positionList.forEach(e -> {
            if (e.getAirCargoPallet() != null) {
                output.add(e.getAirCargoPallet());
                e.setAirCargoPallet(null);
            }
        });

        return output;
    }

    public boolean load(RearStowagePosition rearStowagePosition) {
        if (!this.isComplete()) {
            this.positionList.forEach(e -> {
                if (e.getId() == rearStowagePosition.getId() && e.getAirCargoPallet() == null) {
                    e.setAirCargoPallet(rearStowagePosition.getAirCargoPallet());
                    return true;
                }
            });
            return false;
        }

        return false;
    }

    public ArrayList<RearStowagePosition> getPositionList() {
        return positionList;
    }

    public void setPositionList(ArrayList<RearStowagePosition> positionList) {
        this.positionList = positionList;
    }
}
