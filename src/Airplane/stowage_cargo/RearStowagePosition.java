package Airplane.stowage_cargo;

import Airport.Base.AirCargoPallet;

// einzelne Position im hinteren Laderaum eines Flugzeugs
public class RearStowagePosition {

    private RearStowagePositionID id;

    private AirCargoPallet airCargoPallet;

    // Konstruktor
    RearStowagePosition(RearStowagePositionID id, AirCargoPallet airCargoPallet) {
        this.id = id;
        this.airCargoPallet = airCargoPallet;
    }

    public RearStowagePositionID getId() {
        return this.id;
    }

    public AirCargoPallet getAirCargoPallet() {
        return this.airCargoPallet;
    }

    protected void setAirCargoPallet( AirCargoPallet pallet ) {
        this.airCargoPallet = pallet;
    }

}
