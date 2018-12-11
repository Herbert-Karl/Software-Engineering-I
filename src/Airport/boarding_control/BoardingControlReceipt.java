package Airport.boarding_control;

import Airport.airport.Gate;
import Airport.base.BoardingPass;

import java.util.ArrayList;

public class BoardingControlReceipt {
    private String uuid;
    private Gate gate;
    private ArrayList<BoardingPass> boardingPassArrayList;

    public BoardingControlReceipt(String uuid, Gate gate, ArrayList<BoardingPass> boardingPassArrayList) {
        this.uuid = uuid;
        this.gate = gate;
        this.boardingPassArrayList = boardingPassArrayList;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public ArrayList<BoardingPass> getBoardingPassArrayList() {
        return boardingPassArrayList;
    }

    public void setBoardingPassArrayList(ArrayList<BoardingPass> boardingPassArrayList) {
        this.boardingPassArrayList = boardingPassArrayList;
    }
}
