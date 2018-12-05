package stowage_cargo;

public class RearStowagePosition {

    private RearStowagePositionID id;

    private AirCargoPallet airCargoPallet;

    // Konstruktor
    //
    RearStowagePosition(RearStowagePositionID id, AirCargoPallet airCargoPallet) {
        this.id = id;
        this.airCargoPallet = airCargoPallet;
    }

    public RearStowagePositionID get_id() {
        return this.id;
    }

    public AirCargoPallet get_airCargoPallet() {
        return this.airCargoPallet;
    }

    protected void set_airCargoPallet( AirCargoPallet pallet ) {
        this.airCargoPallet = pallet;
    }

}
