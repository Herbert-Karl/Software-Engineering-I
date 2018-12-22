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

    ///
    /// Getter:
    ///

    public String getUuid() {
        return uuid;
    }

    public String getFlight() {
        return flight;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public int getSequence() {
        return sequence;
    }

    public String getVia01() {
        return via01;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getVia02() {
        return via02;
    }

    public String getVia03() {
        return via03;
    }

    public BoardingPass getBoardingPass() {
        return boardingPass;
    }

    ///
    /// Setter:
    ///

    public void setVia01(String via){
        this.via01 = via;
    }

    public void setVia02(String via){
        this.via02 = via;
    }

    public void setVia03(String via){
        this.via03 = via;
    }
}
