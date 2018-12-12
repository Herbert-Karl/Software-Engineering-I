package Airport.scanner;

import Airport.base.IDCard;

public class ReadingDevice implements IReadingDevice {
    private String uuid;
    private String id;
    private String type;
    private IDCard idCard;

    public ReadingDevice(String uuid, String id, String type, IDCard idCard) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.idCard = idCard;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public boolean verify(IDCard idCard, String password) {
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

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }
}
