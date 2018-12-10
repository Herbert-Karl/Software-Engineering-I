package Airplane.stowage_cargo;

import Airport.base.AirCargoPallet;

public class RearStowagePosition {
    private RearStowagePositionID id;
    private AirCargoPallet airCargoPallet;

    public RearStowagePosition(RearStowagePositionID id, AirCargoPallet airCargoPallet) {
        this.id = id;
        this.airCargoPallet = airCargoPallet;
    }

    public RearStowagePositionID getId() {
        return id;
    }

    public void setId(RearStowagePositionID id) {
        this.id = id;
    }

    public AirCargoPallet getAirCargoPallet() {
        return airCargoPallet;
    }

    public void setAirCargoPallet(AirCargoPallet airCargoPallet) {
        this.airCargoPallet = airCargoPallet;
    }
}
