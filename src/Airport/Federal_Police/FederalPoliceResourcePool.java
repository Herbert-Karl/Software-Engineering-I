package Airport.Federal_Police;

import java.util.ArrayList;

public class FederalPoliceResourcePool {
    private ArrayList<FederalPoliceOfficer> federalPoliceOfficerList;
    private ArrayList<IFederalPoliceCar> federalPoliceCarList;

    public FederalPoliceResourcePool(ArrayList<FederalPoliceOfficer> federalPoliceOfficerList, ArrayList<IFederalPoliceCar> federalPoliceCarList) {
        this.federalPoliceOfficerList = federalPoliceOfficerList;
        this.federalPoliceCarList = federalPoliceCarList;
    }

    public ArrayList<FederalPoliceOfficer> getFederalPoliceOfficerList() {
        return federalPoliceOfficerList;
    }

    public void setFederalPoliceOfficerList(ArrayList<FederalPoliceOfficer> federalPoliceOfficerList) {
        this.federalPoliceOfficerList = federalPoliceOfficerList;
    }

    public ArrayList<IFederalPoliceCar> getFederalPoliceCarList() {
        return federalPoliceCarList;
    }

    public void setFederalPoliceCarList(ArrayList<IFederalPoliceCar> federalPoliceCarList) {
        this.federalPoliceCarList = federalPoliceCarList;
    }
}
