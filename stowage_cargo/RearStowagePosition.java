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

}
