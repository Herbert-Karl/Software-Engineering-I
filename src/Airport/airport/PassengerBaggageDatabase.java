package Airport.airport;

import Airport.base.Passenger;

import java.util.ArrayList;

public class PassengerBaggageDatabase {
    private ArrayList<Passenger> passengerArrayList;

    public PassengerBaggageDatabase(ArrayList<Passenger> passengerArrayList) {
        this.passengerArrayList = passengerArrayList;
    }

    public int loadPassengerData(String dataFilePath) {
        return 0;
    }

    public int loadAssignCabinBaggageData(String dataFilePath) {
        return 0;
    }

    public int loadAssignNormalBaggageData(String dataFilePath) {
        return 0;
    }

    public int loadAssignBulkyBaggaData(String dataFilePath) {
        return 0;
    }

    public ArrayList<Passenger> getPassengerArrayList() {
        return passengerArrayList;
    }

    public void setPassengerArrayList(ArrayList<Passenger> passengerArrayList) {
        this.passengerArrayList = passengerArrayList;
    }
}
