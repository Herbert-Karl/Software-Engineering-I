package Airplane.stowage_cargo;

import Airport.Base.Container;
import Airport.Base.ContainerType;

// einzelne Position im vorderen Laderaum des Flugzeugs
public class FrontStowagePosition {

    private FrontStowagePositionID id;

    private Container container;

    // Konstruktor
    // falls der gegebene Container nicht vom ContainerType AKE ist, wird eine RuntimeException ausgelöst
    FrontStowagePosition(FrontStowagePositionID id, Container container) {
        this.id = id;
        if(container.getType() != ContainerType.AKE) { throw new RuntimeException("falscher ContainerType"); }
        this.container = container;
    }

    public FrontStowagePositionID getId() {
        return this.id;
    }

    public Container getContainer() {
        return this.container;
    }

    protected void setContainer(Container container) {
        this.container = container;
    }
}
