package Airplane.stowage_cargo;

import Airport.Base.Container;
import Airport.Base.ContainerType;

public class StowageNumberFive implements IStowageNumberFive {

    private Container container;

    // Konstruktor
    StowageNumberFive() {
        this.container = null;
    }

    //  load-Funktion
    // füllt die Variable container mit dem übergebenen Container
    // der Container muss vom ContainerType AKH sein!
    // falls bereits ein Container geladen ist oder der ContainerType != AKH ist, wird eine RuntimeException ausgelöst
    public void load(Container container) {
        if(container.getType() != ContainerType.AKH) { throw new RuntimeException("Der ContainerType stimmt nicht mit der Vorgabe für StowageNumberFive überein!"); }
        if(this.container != null) { throw new RuntimeException("Es befindet sich bereits ein Container im StowageNumberFive!"); }
        this.container = container;
    }

    //  unload-Funktion
    // gibt den im Laderaum gehaltenen Conatiner zurück und setzt den Laderaum wieder auf "null" (leer)
    // falls kein Container im Laderaum enthalten ist, wird eine RuntimeException ausgelöst
    public Container unload() {
        if(this.container == null) { throw new RuntimeException("Es befindet sich kein Container im StowageNumberFive!"); }
        Container helpObject = this.container;
        this.container = null;
        return helpObject;
    }

    //  weight-Funktion
    // reicht das Gewicht des geladenen Containers durch
    // falls kein Container im Laderaum enthalten ist, wird eine RuntimeException ausgelöst
    public double weightOfStowageNumberFive() {
        if(this.container == null) { throw new RuntimeException("Es befindet sich kein Container im StowageNumberFive!"); }
        return container.getWeight();
    }

}
