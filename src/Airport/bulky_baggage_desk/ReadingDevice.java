package Airport.bulky_baggage_desk;

import Airport.base.BoardingPass;
import Airport.base.Passport;

public class ReadingDevice implements IReadingDevice {
    private String uuid;
    private String id;
    private String type;

    public ReadingDevice(String uuid, String id, String type) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public boolean scan(Passport passport) {
        return false;
    }

    @Override
    public boolean scan(BoardingPass boardingPass) {
        return false;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
