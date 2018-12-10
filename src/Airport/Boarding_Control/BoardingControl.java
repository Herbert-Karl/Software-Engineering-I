package Airport.Boarding_Control;


import Airport.Base.BoardingPass;
import Airport.Base.Passport;
import Airport.Scanner.ReadingDevice;

public class BoardingControl implements Airport.Boarding_Control.IBoardingControl {

    private ReadingDevice readingDevice;
    private ArrayList<BoardingPassList> boardingPassList;
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
    public void print(PassengerList passengerList)
    {
        System.out.println("Test"+passengerList);
    }
    public void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt)
    {
        GroundOperationsCenter.receive(boardingControlReceipt);
    }


}
