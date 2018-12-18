package Airport.Checkin_Desk;

import java.util.UUID;

public class ReadingDevice {
    private String uuid;
    private String type;
    private String id;

    public ReadingDevice(String type, String id){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.type = type;
        this.id = id;
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
