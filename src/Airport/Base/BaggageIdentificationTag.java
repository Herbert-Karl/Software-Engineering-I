package Airport.Base;

import java.util.UUID;

public class BaggageIdentificationTag {
    private String uuid;
    private BoardingPass boardingPass;
    private String flight;
    private int sequence;
    private String via01 = "N/A";
    private String via02 = "N/A";
    private String via03 = "N/A";
    private Baggage baggage;
    private boolean isLocal = true;
    private boolean isTransfer = false;
    private String barcode;

    public BaggageIdentificationTag(BoardingPass boardingPass, String flight, int sequence, Baggage baggage, String barcode){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.boardingPass = boardingPass;
        this.flight = flight;
        this.sequence = sequence;
        this.baggage = baggage;
        this.barcode = barcode;
    }
}
