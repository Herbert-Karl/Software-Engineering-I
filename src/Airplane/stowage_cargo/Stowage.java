package Airplane.stowage_cargo;

// grundlegende Klasse für die beiden Hauptladeräume des Flugzeugs
public class Stowage {

    private StowageType type;

    private boolean isComplete;

    // Konstruktor
    Stowage(StowageType type) {
        this.type = type;
        this.isComplete = false;
    }

    public StowageType getStowageType() {
        return this.type;
    }

    public boolean getIsComplete() {
        return this.isComplete;
    }

    protected void setIsComplete(boolean value) {
        this.isComplete = value;
    }

}
