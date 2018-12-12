package Airport.base;

public class LuggageTube {
    private String uuid;
    private String barCode;
    private String barCodeDestinationBox;
    private Baggage baggage;

    public LuggageTube(String uuid, String barCode, String barCodeDestinationBox, Baggage baggage) {
        this.uuid = uuid;
        this.barCode = barCode;
        this.barCodeDestinationBox = barCodeDestinationBox;
        this.baggage = baggage;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBarCodeDestinationBox() {
        return barCodeDestinationBox;
    }

    public void setBarCodeDestinationBox(String barCodeDestinationBox) {
        this.barCodeDestinationBox = barCodeDestinationBox;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }
}
