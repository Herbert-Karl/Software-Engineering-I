package stowage_cargo;

public class StowageNumberFive implements IStowageNumberFive {

    private Container container;

    // Konstruktor
    //
    StowageNumberFive() {

    }

    // load-Funktion
    // füllt die Variable container mit dem übergebenen Parameter, solange dieser vom ContainerType AKH ist
    // returns:
    //  0 -> ContainerType != AKH
    //  1 -> ContainerType = AKH
    public int load(Container container) {
        if(container.type != ContainerType.AKH) { return 0; }
        this.container = container;
        return 1;
    }
}
