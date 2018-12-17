package Airplane.stowage_cargo;

import Airport.base.AirCargoPallet;
import Airport.base.Container;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CargoSystem implements ICargoSystem {
    private String manufacturer;
    private String type;
    private String id;
    private ArrayList<Stowage> stowages;
    private boolean isLocked;
    private boolean isSecured;
    private double totalWeightContainer;
    private double totalWeightAirCargoPallet;

    public CargoSystem(String manufacturer, String type, String id, ArrayList<Stowage> stowages, boolean isLocked, boolean isSecured, double totalWeightContainer, double totalWeightAirCargoPallet) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.stowages = stowages;
        this.isLocked = isLocked;
        this.isSecured = isSecured;
        this.totalWeightContainer = totalWeightContainer;
        this.totalWeightAirCargoPallet = totalWeightAirCargoPallet;
    }

    @Override
    public String version() {
        return "<" + id + "> - <" + type + ">";
    }

    @Override
    public void unlock() {
        this.isLocked = false;
    }

    @Override
    public void load(Stowage stowage, Container container, FrontStowagePositionID position) {
        if (!this.isLocked) {
            FrontStowage temp = (FrontStowage) stowage;
            boolean result = temp.load(new FrontStowagePosition(position, container));
            if (!result) {
                System.err.println("Not Loaded!");
            }
        }
    }

    @Override
    public void load(Stowage stowage, AirCargoPallet airCargoPallet, RearStowagePositionID position) {
        if (!this.isLocked) {
            RearStowage temp = (RearStowage) stowage;
            boolean result = temp.load(new RearStowagePosition(position, airCargoPallet));
            if (!result) {
                System.err.println("Not Loaded!");
            }
        }
    }

    @Override
    public double determineTotalWeightContainer(Stowage stowage) {
        AtomicReference<Double> weight = new AtomicReference<>(0.0);
        FrontStowage temp = (FrontStowage) stowage;
        temp.getPositionList().forEach(e -> e.getContainer().getBaggageStack().forEach(b -> weight.updateAndGet(v -> (double) (v + b.getWeight()))));
        return weight.get();
    }

    @Override
    public double determineTotalWeigthAirCargoPallet(Stowage stowage) {
        AtomicReference<Double> weight = new AtomicReference<>(0.0);
        RearStowage temp = (RearStowage) stowage;
        temp.getPositionList().forEach(e -> {
            for (int i = 0; i <= e.getAirCargoPallet().getItemList().length; i++) {
                int finalI = i;
                weight.updateAndGet(v -> v + e.getAirCargoPallet().getItemList()[finalI].getWeight());
            }
        });
        return weight.get();
    }

    @Override
    public void secure() {
        this.isSecured = true;
    }

    @Override
    public void lock() {
        if (this.isSecured) {
            this.isLocked = true;
        } else {
            System.err.println("Ladung nicht gesichert!");
        }
    }

    @Override
    public ArrayList<Container> unloadContainer(Stowage stowage) {
        ArrayList<Container> output = new ArrayList<>();
        if (!this.isLocked) {
            this.isSecured = false;
            FrontStowage temp = (FrontStowage) stowage;
            output = temp.unloadAll();
        }
        return output;
    }

    @Override
    public ArrayList<AirCargoPallet> unloadAirCargoPallet(Stowage stowage) {
        ArrayList<AirCargoPallet> output = new ArrayList<>();
        if (!this.isLocked) {
            this.isSecured = false;
            RearStowage temp = (RearStowage) stowage;
            output = temp.unloadAll();
        }
        return output;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Stowage> getStowages() {
        return stowages;
    }

    public void setStowages(ArrayList<Stowage> stowages) {
        this.stowages = stowages;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isSecured() {
        return isSecured;
    }

    public void setSecured(boolean secured) {
        isSecured = secured;
    }

    public double getTotalWeightContainer() {
        return totalWeightContainer;
    }

    public void setTotalWeightContainer(double totalWeightContainer) {
        this.totalWeightContainer = totalWeightContainer;
    }

    public double getTotalWeightAirCargoPallet() {
        return totalWeightAirCargoPallet;
    }

    public void setTotalWeightAirCargoPallet(double totalWeightAirCargoPallet) {
        this.totalWeightAirCargoPallet = totalWeightAirCargoPallet;
    }
}
