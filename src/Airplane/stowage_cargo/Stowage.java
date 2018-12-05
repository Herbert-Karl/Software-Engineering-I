package Airplane.stowage_cargo;

public class Stowage {

    private StowageType type;

    private boolean isComplete;

    // Konstruktor
    //
    Stowage(StowageType type) {
        this.type = type;
        this.isComplete = false;
    }

    public StowageType get_StowageType() {
        return this.type;
    }

    public boolean get_isComplete() {
        return this.isComplete;
    }

    protected void set_isComplete(boolean value) {
        this.isComplete = value;
    }

}
