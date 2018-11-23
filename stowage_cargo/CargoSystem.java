package stowage_cargo;

import java.util.ArrayList;

public class CargoSystem implements ICargoSystem {

    private String manufacturer;

    private String type;

    private String id;

    private ArrayList<Stowage> stowage;

    private boolean isLocked;

    private boolean isSecured = false;

    private double totalWeightAirCargoPallet;

    private double totalWeightContainer;

    // Konstruktor
    //
    CargoSystem(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.stowage = new ArrayList<Stowage>();
        this.isLocked = false;
        this.totalWeightAirCargoPallet = 0.0;
        this.totalWeightContainer = 0.0;
    }

    public String version() {
        return "<" + this.id + "> - <" + this.type + ">";
    }

    public void load(Stowage stowage, Container container, FrontStowagePositionID position) {

    }

    public void load(Stowage stowage, AirCargoPallet airCargoPallet, RearStowagePositionID position) {

    }

    public double determineTotalWeightAirCargoPallet(Stowage stowage) {

    }

    public double determineTotalWeightContainer(Stowage stowage) {

    }

    public void unlock() {
        if(this.isLocked) { this.isLocked = false; }
        else { throw new RuntimeException("CargoSystem bereits aufgeschlossen."); }
    }

    public void secure() {
        if(!this.isSecured) { this.isSecured = true; }
        else { throw new RuntimeException("CargoSystem bereits gesichert."); }
    }

    public void lock() {
        if(!this.isSecured) { throw new RuntimeException("CargoSystem noch nicht gesichert."); }
        if(!this.isLocked) { this.isLocked = true; }
        else { throw new RuntimeException("CargoSystem bereits abgeschlossen."); }
    }

    public ArrayList<Container> unloadContainer(Stowage stowage) {

    }

    public ArrayList<AirCargoPallet> unloadAirCargoPallet(Stowage stowage) {

    }

}
