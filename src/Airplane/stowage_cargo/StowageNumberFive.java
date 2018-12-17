package Airplane.stowage_cargo;

import Airport.base.Container;
import Airport.base.ContainerType;

public class StowageNumberFive implements IStowageNumberFive {
    private Container container;

    public StowageNumberFive() {
        this.container = null;
    }

    @Override
    public void load(Container container) {
        if (container.getType() == ContainerType.AKH && this.container == null) {
            this.container = container;
        }
    }

    @Override
    public Container unload() {
        if (this.container != null) {
            return this.container;
        } else {
            System.err.println("No Container loaded!");
            return null;
        }
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
}
