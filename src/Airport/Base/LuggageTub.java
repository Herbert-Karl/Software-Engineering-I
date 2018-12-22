package Airport.Base;

import java.util.UUID;

public class LuggageTub {
    private String uuid;
    private String barCode;
    private String barCodeDestinationBox;
    private Baggage baggage;

    public LuggageTub(String barCode, String barCodeDestinationBox, Baggage baggage){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.barCode = barCode;
        this.barCodeDestinationBox = barCodeDestinationBox;
        this.baggage = baggage;
    }

    ///
    /// Getter:
    ///

    public Baggage getBaggage() {
        return baggage;
    }

    public String getUuid() {
        return uuid;
    }

    public String getBarCode() {
        return barCode;
    }

    public String getBarCodeDestinationBox() {
        return barCodeDestinationBox;
    }

    ///
    /// Setter:
    ///


    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public void setBarCodeDestinationBox(String barCodeDestinationBox) {
        this.barCodeDestinationBox = barCodeDestinationBox;
    }
}