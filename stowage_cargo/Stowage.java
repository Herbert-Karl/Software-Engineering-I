package stowage_cargo;

public class Stowage {

    private StowageType type;

    private boolean isComplete;

    // Konstruktor
    //
    Stowage(StowageType type) {
        this.type = type;
        this.isComplete = false;
    }
}
