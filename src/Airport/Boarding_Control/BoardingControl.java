package Airport.Boarding_Control;

import Airplane.Management.ISeatManagement;
import Airport.Base.BoardingPass;
import Airport.Base.Passenger;
import Airport.Base.Passport;
import Airport.Boarding_Control.BoardingControlReceipt;
import Airport.Ground_Operations.GroundOperationsCenter;
import Airport.Scanner.ReadingDevice;

import java.util.ArrayList;


public class BoardingControl implements IBoardingControl {

    private ReadingDevice readingDevice;
    private ArrayList<BoardingPass> boardingPassList;
    private ISeatManagement seatManagement;

    public BoardingControl() {

    }

    public boolean inspect(Passport passport)
    {
        return true;
    }
    public boolean scan(BoardingPass boardingPass)
    {
        return true;
    }
    public void print(ArrayList<Passenger> passengerList)
    {

    }
    public void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt)
    {
        GroundOperationsCenter.receive(boardingControlReceipt);
    }


}
