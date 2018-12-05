package stowage_cargo;

public class FrontStowagePosition {

    private FrontStowagePositionID id;

    private Container container;

    // Konstruktor
    //
    FrontStowagePosition(FrontStowagePositionID id, Container container) {
        this.id = id;
        if(container.get_type() != ContainerType.AKE) { throw new RuntimeException("falscher ContainerType"); }
        this.container = container;
    }

    public FrontStowagePositionID get_id() {
        return this.id;
    }

    public Container get_container() {
        return this.container;
    }

    protected void set_container(Container container) {
        this.container = container;
    }
}
