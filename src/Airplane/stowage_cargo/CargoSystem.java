package Airplane.stowage_cargo;

import java.util.ArrayList;

import Airport.Base.Container;
import Airport.Base.AirCargoPallet;

// Implementierung des Interfaces für den Laderaum
// der Laderaum wird dabei in zwei Teile getelt: einen vorderen und einen hinteren
// der vordere Laderaum ist für Container gedacht, der hintere Laderaum für AIrCargoPallets
public class CargoSystem implements ICargoSystem {

    private String manufacturer;

    private String type;

    private String id;

    private Stowage frontStowage;

    private Stowage rearStowage;

    private boolean isLocked;

    private boolean isSecured = false;

    private double totalWeightAirCargoPallet;

    private double totalWeightContainer;

    // Konstruktor
    CargoSystem(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.frontStowage = new FrontStowage();
        this.rearStowage = new RearStowage();
        this.isLocked = false;
        this.totalWeightAirCargoPallet = 0.0;
        this.totalWeightContainer = 0.0;
    }

    //  Funktion für Meta-Informationen
    // liefert die ID und den Typ des CargoSystems
    public String version() {
        return "<" + this.id + "> - <" + this.type + ">";
    }

    //  load-Funktion für den vorderen Laderaum
    // fügt den Container mit der gegebenen Position in den Laderaum ein
    // außerdem wird das Gewicht der Container notiert
    // falls der Laderaum bereits gesicher oder abgeschlossen ist, wird eine RuntimeException ausgelöst
    // zu beachten: RuntimeException der innerhalb auferufenen Funktionen!
    public void load(Container container, FrontStowagePositionID position) {
        if(this.isLocked || this.isSecured) { throw new RuntimeException("CargoSystem bereits gesichert oder geschlossen!"); }
        FrontStowagePosition helpPosition = new FrontStowagePosition(position, container);
        ((FrontStowage) this.frontStowage).add_to_positionList(helpPosition);
        this.totalWeightContainer += container.getWeight();
    }

    //  load-Funktion für den hinteren Laderaum
    // fügt das AirCargoPallet mit der gegebenen Position in den Laderaum ein
    // weiterhin wird das Gewicht der AirCargoPallets notiert
    // falls der Laderaum bereits gesicher oder abgeschlossen ist, wird eine RuntimeException ausgelöst
    // zu beachten: RuntimeException der innerhalb auferufenen Funktionen!
    public void load(AirCargoPallet airCargoPallet, RearStowagePositionID position) {
        if(this.isLocked || this.isSecured) { throw new RuntimeException("CargoSystem bereits gesichert oder geschlossen!"); }
        RearStowagePosition helpPosition = new RearStowagePosition(position, airCargoPallet);
        ((RearStowage) this.rearStowage).add_to_positionList(helpPosition);
        this.totalWeightAirCargoPallet += airCargoPallet.getWeight();
    }

    //  weight-Funktion für den hinteren Laderaum = geladene AirCargoPallets
    // gibt den gemerkten/ notierten Wert aus
    public double determineTotalWeightAirCargoPallet() {
        return this.totalWeightAirCargoPallet;
    }

    //  weight-Funktion für den vorderen Laderaum = geladene Container
    // gibt den gemerkten/ notierten Wert aus
    public double determineTotalWeightContainer() {
        return this.totalWeightContainer;
    }

    //  lock-Funktion
    // falls die Ladung noch nicht gesicher ist, oder der Laderaum bereits abgeschlossen ist, wird eine RuntimeException ausgelöst
    public void lock() {
        if(!this.isSecured) { throw new RuntimeException("CargoSystem noch nicht gesichert."); }
        if(!this.isLocked) { this.isLocked = true; }
        else { throw new RuntimeException("CargoSystem bereits abgeschlossen."); }
    }

    //  unlock-Funktion
    // falls der Laderaum bereits aufgeschlossen ist, wird eine RuntimeException ausgelöst
    public void unlock() {
        if(this.isLocked) { this.isLocked = false; }
        else { throw new RuntimeException("CargoSystem bereits aufgeschlossen."); }
    }

    //  secure-Funktion
    // falls die Ladung bereits gesichert ist, wird eine RuntimeException ausgelöst
    public void secure() {
        if(!this.isSecured) { this.isSecured = true; }
        else { throw new RuntimeException("CargoSystem bereits gesichert."); }
    }

    //  unload-Funktion für den vorderen Laderaum = geladene Container
    // entsichert die Ladung und gibt alle Container zurück, die sich im vorderen Laderaum befinden
    // dabei werden die Positionen der Container nicht beachtet
    // falls der Laderaum noch abgeschlossen ist oder der Laderaum bereits leer ist, wird eine RuntimeException ausgelöst
    public ArrayList<Container> unloadContainer() {
        if(this.isLocked) { throw new RuntimeException("CargoSystem noch verschlossen!"); }
        this.isSecured = false;
        ArrayList<Container> helpList = new ArrayList<Container>();
        FrontStowagePosition helpObject = ((FrontStowage) this.frontStowage).remove_from_positionList();
        if(helpObject == null) { throw new RuntimeException("vorderer Laderaum ist bereits leer"); }
        do {
            helpList.add(helpObject.getContainer());
            helpObject = ((FrontStowage) this.frontStowage).remove_from_positionList();
        } while(helpObject != null);
        this.totalWeightContainer = 0.0;
        return helpList;
    }

    //  unload-Funktion für den hinteren Laderaum = geladenen AirCargoPallets
    // entsichert die Ladung und gibt ein AirCargoPallet zurück, welches sich im hinteren Laderaum befindet
    // dabei werden die Positionen der AirCargoPallets nicht beachtet
    // befindet sich kein AirCargoPallet mehr im hinteren Laderaum, wird "null" zurückgegeben
    // falls der Laderaum noch abgeschlossen ist, wird eine RuntimeException ausgelöst
    public AirCargoPallet unloadAirCargoPallet() {
        if(this.isLocked) { throw new RuntimeException("CargoSystem noch verschlossen!"); }
        this.isSecured = false;
        RearStowagePosition helpObject = ((RearStowage) this.rearStowage).remove_from_positionList();
        if(helpObject == null) { return null; }
        AirCargoPallet pallet = helpObject.getAirCargoPallet();
        this.totalWeightAirCargoPallet -= pallet.getWeight();
        return pallet;
    }

    public String getManufacturer() { return this.manufacturer; }

}
