package Airport.Base;

public class LuggageTub {
    private string uuid;
    private string barCode;
    private string barCodeDestinationBox;
    private Baggage baggage;

    public LuggageTub(String uuid, String barCode, String barCodeDestinationBox, Baggage baggage){
        this.uuid = uuid;
        this.barCode = barCode;
        this.barCodeDestinationBox = barCodeDestinationBox;
        this.baggage = baggage;
    }

    public Baggage getBaggage() {
        return baggage;
    }
}