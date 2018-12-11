package Airport.boarding_control;

import Airplane.management.ISeatManagement;
import Airport.base.BoardingPass;
import Airport.base.Passport;
import Airport.scanner.ReadingDevice;

import java.util.ArrayList;

public class BoardingControl implements IBoardingControl {
    private ReadingDevice readingDevice;
    private ArrayList<BoardingPass> boardingPassArrayList;
    private ISeatManagement seatManagement;

    public BoardingControl(ReadingDevice readingDevice, ArrayList<BoardingPass> boardingPassArrayList, ISeatManagement seatManagement) {
        this.readingDevice = readingDevice;
        this.boardingPassArrayList = boardingPassArrayList;
        this.seatManagement = seatManagement;
    }

    @Override
    public boolean inspect(Passport passport) {
        return false;
    }

    @Override
    public boolean scan(BoardingPass boardingPass) {
        return false;
    }

    @Override
    public void print() {

    }

    @Override
    public void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt) {

    }

    public ReadingDevice getReadingDevice() {
        return readingDevice;
    }

    public void setReadingDevice(ReadingDevice readingDevice) {
        this.readingDevice = readingDevice;
    }

    public ArrayList<BoardingPass> getBoardingPassArrayList() {
        return boardingPassArrayList;
    }

    public void setBoardingPassArrayList(ArrayList<BoardingPass> boardingPassArrayList) {
        this.boardingPassArrayList = boardingPassArrayList;
    }

    public ISeatManagement getSeatManagement() {
        return seatManagement;
    }

    public void setSeatManagement(ISeatManagement seatManagement) {
        this.seatManagement = seatManagement;
    }
}
