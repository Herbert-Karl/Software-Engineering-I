package Airport.Boarding_Control;

import Airport.Airport.Gate;

public class BoardingControlReceipt {

    private String uuid;
    private Gate gate;
    private ArrayList<BoardingPassList> boardingPassList;

    public BoardingControlReceipt(String uuid, Gate gate, ArrayList<BoardingPassList> boardingPassList) {
        this.uuid = uuid;
        this.gate = gate;
        this.boardingPassList = boardingPassList;
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

    public ArrayList<BoardingPassList> getBoardingPassList() {
        return boardingPassList;
    }

    public void setBoardingPassList(ArrayList<BoardingPassList> boardingPassList) {
        this.boardingPassList = boardingPassList;
    }
}