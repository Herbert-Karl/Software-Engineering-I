package Ariport.Base;

public class BaggageIdentificationTag {
    private string uuid;
    private BoardingPass boardingPass;
    private string flight;
    private int sequence;
    private string via01="N/A";
    private string via02="N/A";
    private string via03="N/A";
    private Baggage baggage;
    private boolean isLocal=true;
    private boolean isTransfer=false;
    private string barCode;

    public BaggageIdentificationTag(String uuid, BoardingPass boardingPass, String flight, int sequence, String via01, String via02, String via03, Baggage baggage, boolean isLocal, boolean isTransfer, String barCode) {
        this.uuid = uuid;
        this.boardingPass = boardingPass;
        this.flight = flight;
        this.sequence = sequence;
        this.via01 = via01;
        this.via02 = via02;
        this.via03 = via03;
        this.baggage = baggage;
        this.isLocal = isLocal;
        this.isTransfer = isTransfer;
        this.barCode = barCode;
    }
}