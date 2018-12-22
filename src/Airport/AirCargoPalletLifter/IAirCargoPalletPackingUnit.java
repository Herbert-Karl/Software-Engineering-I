package Airport.AirCargoPalletLifter;

import Airport.Base.Employee;
import Airport.Base.Item;

import java.util.ArrayList;

public interface IAirCargoPalletPackingUnit {
    boolean loginItemScanner(Employee employee, String password);
    void logoutItemScanner();
    boolean scan(Item item, String pattern);
    void handOverToCustoms(Item item);
    void sort(ArrayList<Item> itemList);
    void pack ();
    void sendAirCargoPalletLifterToGate();
    LoadingStrategy optimizeAirplaneLoading();
    void setAirCargoPalletVehicle();
    void loadAirCargoPalletVehicle(LoadingStrategy strategy);
    void sendAirCargoPalletVehicleToGate();
}
