package Airplane.stowage_cargo;

import java.util.ArrayList;

import Airport.Base.AirCargoPallet;
import Airport.Base.Container;

// Interface für den Hauptladeraum eines Flugzeugs
public interface ICargoSystem {

    // gibt Meta-Informationen zum Laderaum zurück
    String version();

    // lädt einen Container in den Laderaum an die gegebene Position
    void load(Container container, FrontStowagePositionID position);

    // lädt ein AirCargoPallet in den Laderaum an die gegebene Position
    void load(AirCargoPallet airCargoPallet, RearStowagePositionID position);

    // liefert das Gewicht aller geladenen AirCargoPallets
    double determineTotalWeightAirCargoPallet();

    // liefert das Gewicht aller geladenen Container
    double determineTotalWeightContainer();

    // öffnet Laderaum /schließt auf
    void unlock();

    // sichert Laderaum
    void secure();

    // verschließt Laderaum
    void lock();

    // entlädt alle Container auf einmal aus dem Laderaum
    ArrayList<Container> unloadContainer();

    // entlädt ein einzelnes AirCargoPallet aus dem Laderaum
    // z. B. für die Aufnahme/ Entgegenahme durch ein entsprechendes Fahrzeug
    AirCargoPallet unloadAirCargoPallet();

}
