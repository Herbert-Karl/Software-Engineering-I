package Ariport.Base;

import java.util.UUID;

public class BaggageIdentificationTag {
    private String uuid;
    private BoardingPass boardingPass;
    private String flight;
    private int sequence;
    private String via01="N/A";
    private String via02="N/A";
    private String via03="N/A";
    private Baggage baggage;
    private boolean isLocal=true;
    private boolean isTransfer=false;
    private String barCode;

    public BaggageIdentificationTag(BoardingPass boardingPass, String flight, int sequence, String via01, String via02,
                                    String via03, Baggage baggage, boolean isLocal, boolean isTransfer, String barCode) {
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
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