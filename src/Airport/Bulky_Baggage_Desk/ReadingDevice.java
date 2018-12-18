package Airport.Bulky_Baggage_Desk;

import Airport.Base.BoardingPass;
import Airport.Base.Passport;

import java.util.UUID;
import java.uitl.Random;

public class ReadingDevice implements IReadingDevice{
    private String uuid;
    private String type;
    private String id;

    public ReadingDevice(String type){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.type = type;
        Random random = new Random();
        id = "" + (random.nextInt(100) + 1);
    }

    public String version(){
        //TODO
    }

    public boolean scan(Passport passport){
        //TODO
        return false;
    }

    public boolean scan(BoardingPass boardingPass){
        //TODO
        return false;
    }
}
