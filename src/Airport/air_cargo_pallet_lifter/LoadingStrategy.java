package Airport.air_cargo_pallet_lifter;

import Airplane.stowage_cargo.Stowage;

import java.util.ArrayList;

public class LoadingStrategy {
    private Stowage stowage;
    private ArrayList<String> containerIDList;

    public LoadingStrategy(Stowage stowage, ArrayList<String> containerIDList) {
        this.stowage = stowage;
        this.containerIDList = containerIDList;
    }

    public Stowage getStowage() {
        return stowage;
    }

    public void setStowage(Stowage stowage) {
        this.stowage = stowage;
    }

    public ArrayList<String> getContainerIDList() {
        return containerIDList;
    }

    public void setContainerIDList(ArrayList<String> containerIDList) {
        this.containerIDList = containerIDList;
    }
}
