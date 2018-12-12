package Airport.air_cargo_pallet_lifter;

import Airport.base.Employee;
import Airport.base.Item;

import java.util.ArrayList;

public interface IAirCargoPalletPackingUnit {
    boolean logInItemScanner(Employee employee, String password);
    void logOutItemScanner();
    boolean scan(Item item, String pattern);
    void handOverToCustoms(Item item);
    void sort(ArrayList<Item> itemArrayList);
    void pack();
    void sendAirCargoPalletLifterToGate();
    void optimizeAirplaneLoading();
    void setAirCargoPalletVehicle();
    void loadAirCargoPalletVehicle(LoadingStrategy strategy);
    void sendAirCargoPalletVehicleToGate();
}
