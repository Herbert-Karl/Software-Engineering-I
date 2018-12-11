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

    public Baggage getBaggage() {
        return baggage;
    }
}