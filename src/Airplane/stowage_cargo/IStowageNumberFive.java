package Airplane.stowage_cargo;

import Airport.Base.Container;

// Interface für den kleinen, speziellen Laderaum beim Flugzeug
public interface IStowageNumberFive {

    // füllt den Laderaum mit einem Container
    void load(Container container);

    // gibt den im Laderaum enthaltenen Container zurück
    Container unload();

    // gibt das Gewicht des Laderaums = Gewicht des Containers im Laderaum zurück
    double weightOfStowageNumberFive();

}
