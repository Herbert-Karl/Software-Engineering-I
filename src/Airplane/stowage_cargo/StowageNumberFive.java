package Airplane.stowage_cargo;

public class StowageNumberFive implements IStowageNumberFive {
    Container container;

    public StowageNumberFive(Container container) {
        this.container = container;
    }

    @Override
    public int load(Container container) {
        return 0;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
}
