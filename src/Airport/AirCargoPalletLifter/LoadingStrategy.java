package Airport.AirCargoPalletLifter;

import Airplane.stowage_cargo.Stowage;

import java.util.ArrayList;

public class LoadingStrategy {
    private Stowage stowage;
    private ArrayList containerIDList;

    public LoadingStrategy(Stowage stowage, ArrayList containerIDList) {
        this.stowage = stowage;
        this.containerIDList = containerIDList;
    }

    public Stowage getStowage() {
        return stowage;
    }

    public ArrayList getContainerIDList() {
        return containerIDList;
    }

    public void setStowage(Stowage stowage) {
        this.stowage = stowage;
    }

    public void setContainerIDList(ArrayList containerIDList) {
        this.containerIDList = containerIDList;
    }
}
