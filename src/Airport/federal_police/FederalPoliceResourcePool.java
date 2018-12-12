package Airport.federal_police;

import java.util.ArrayList;

public class FederalPoliceResourcePool {
    private ArrayList<FederalPoliceOfficer> federalPoliceOfficerArrayList;
    private ArrayList<IFederalPoliceCar> federalPoliceCarArrayList;

    public FederalPoliceResourcePool(ArrayList<FederalPoliceOfficer> federalPoliceOfficerArrayList, ArrayList<IFederalPoliceCar> federalPoliceCarArrayList) {
        this.federalPoliceOfficerArrayList = federalPoliceOfficerArrayList;
        this.federalPoliceCarArrayList = federalPoliceCarArrayList;
    }

    public ArrayList<FederalPoliceOfficer> getFederalPoliceOfficerArrayList() {
        return federalPoliceOfficerArrayList;
    }

    public void setFederalPoliceOfficerArrayList(ArrayList<FederalPoliceOfficer> federalPoliceOfficerArrayList) {
        this.federalPoliceOfficerArrayList = federalPoliceOfficerArrayList;
    }

    public ArrayList<IFederalPoliceCar> getFederalPoliceCarArrayList() {
        return federalPoliceCarArrayList;
    }

    public void setFederalPoliceCarArrayList(ArrayList<IFederalPoliceCar> federalPoliceCarArrayList) {
        this.federalPoliceCarArrayList = federalPoliceCarArrayList;
    }
}
