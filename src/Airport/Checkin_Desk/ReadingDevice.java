package Airport.Checkin_Desk;

import Airport.Base.Passport;

import java.util.UUID;

public class ReadingDevice implements IReadingDevice{
    private String uuid;
    private String type;
    private String id;

    public ReadingDevice(String type, String id){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.type = type;
        this.id = id;
    }

    public String version(){
        //TODO
        return "";
    }

    public boolean scan(Passport passport){
        //TODO
        return false;
    }

    public String getUuid() {
        return uuid;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}
