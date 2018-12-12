package Airport.base;

public class BaggageIdentificationTag {
    private String uuid;
    private BoardingPass boardingPass;
    private String flight;
    private int sequence;
    private String via01;
    private String via02;
    private String via03;
    private Baggage baggage;
    private boolean isLocal;
    private boolean isTransfer;
    private String barCode;

    public BaggageIdentificationTag(String uuid, BoardingPass boardingPass, String flight, int sequence, Baggage baggage, String barCode) {
        this.uuid = uuid;
        this.boardingPass = boardingPass;
        this.flight = flight;
        this.sequence = sequence;
        this.baggage = baggage;
        this.barCode = barCode;
        this.isLocal = true;
        this.isTransfer = false;
        this.via01 = "N/A";
        this.via02 = "N/A";
        this.via03 = "N/A";
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public BoardingPass getBoardingPass() {
        return boardingPass;
    }

    public void setBoardingPass(BoardingPass boardingPass) {
        this.boardingPass = boardingPass;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getVia01() {
        return via01;
    }

    public void setVia01(String via01) {
        this.via01 = via01;
    }

    public String getVia02() {
        return via02;
    }

    public void setVia02(String via02) {
        this.via02 = via02;
    }

    public String getVia03() {
        return via03;
    }

    public void setVia03(String via03) {
        this.via03 = via03;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public void setLocal(boolean local) {
        isLocal = local;
    }

    public boolean isTransfer() {
        return isTransfer;
    }

    public void setTransfer(boolean transfer) {
        isTransfer = transfer;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
}
