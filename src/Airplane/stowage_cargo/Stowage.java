package Airplane.stowage_cargo;

public class Stowage {
    StowageType type;
    boolean isComplete;

    public Stowage(StowageType type, boolean isComplete) {
        this.type = type;
        this.isComplete = isComplete;
    }

    public StowageType getType() {
        return type;
    }

    public void setType(StowageType type) {
        this.type = type;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
