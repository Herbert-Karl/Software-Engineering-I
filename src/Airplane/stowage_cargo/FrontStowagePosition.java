package Airplane.stowage_cargo;

import Airport.base.Container;

public class FrontStowagePosition {
    private FrontStowagePositionID id;
    private Container container;

    public FrontStowagePosition(FrontStowagePositionID id, Container container) {
        this.id = id;
        this.container = container;
    }

    public FrontStowagePositionID getId() {
        return id;
    }

    public void setId(FrontStowagePositionID id) {
        this.id = id;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
}
