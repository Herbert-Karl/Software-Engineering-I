package src.Airport.Boarding_Control;

public class BoardingControlReceipt {

    private String uuid;
    private Gate gate;
    private ArrayList<BoardingPass> boardingPassList;

    public BoardingControlReceipt(String uuid, Gate gate, ArrayList<BoardingPass> boardingPassList) {
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

    public ArrayList<BoardingPass> getBoardingPassList() {
        return boardingPassList;
    }

    public void setBoardingPassList(ArrayList<BoardingPass> boardingPassList) {
        this.boardingPassList = boardingPassList;
    }
}