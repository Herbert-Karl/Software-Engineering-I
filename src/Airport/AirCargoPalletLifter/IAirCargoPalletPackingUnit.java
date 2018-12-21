package Airport.AirCargoPalletLifter;

import Airport.Airport.Gate;
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
    void sendAirCargoPalletLifterToGate(Gate gate,AirCargoPalletLifter airCargoPalletLifter);
    void optimizeAirplaneLoading();
    void setAirCargoPalletVehicle(AirCargoPalletVehicle airCargoPalletVehicle);
    void loadAirCargoPalletVehicle(LoadingStrategy strategy,AirCargoPalletVehicle airCargoPalletVehicle);
    void sendAirCargoPalletVehicleToGate(Gate gate,AirCargoPalletVehicle airCargoPalletVehicle);
}
