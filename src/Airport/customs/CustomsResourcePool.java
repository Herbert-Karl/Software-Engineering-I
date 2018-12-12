package Airport.customs;

import java.util.ArrayList;

public class CustomsResourcePool {
    private ArrayList<CustomsOfficer> customsOfficerArrayList;

    public CustomsResourcePool(ArrayList<CustomsOfficer> customsOfficerArrayList) {
        this.customsOfficerArrayList = customsOfficerArrayList;
    }

    public ArrayList<CustomsOfficer> getCustomsOfficerArrayList() {
        return customsOfficerArrayList;
    }

    public void setCustomsOfficerArrayList(ArrayList<CustomsOfficer> customsOfficerArrayList) {
        this.customsOfficerArrayList = customsOfficerArrayList;
    }
}
