package stowage_cargo;

public class FrontStowagePosition {

    private FrontStowagePositionID id;

    private Container container;

    // Konstruktor
    //
    FrontStowagePosition(FrontStowagePositionID id, Container container) {
        this.id = id;
        if(container.type != ContainerType.AKE) { throw new RuntimeException("falscher ContainerType"); }
        this.container = container;
    }

}
