package Airport.Scanner;

import Airport.Base.IDCard;

public class ReadingDevice implements IReadingDevice {
    private String uuid;
    private String type;
    private String id;
    private IDCard idCard;

    public ReadingDevice(String uuid, String type, String id, IDCard idCard) {
        this.uuid = uuid;
        this.type = type;
        this.id = id;
        this.idCard = idCard;
    }

    @Override
    public String version() {
        return "<" + id + "> - <" + type + ">";
    }


    @Override
    public boolean verify(IDCard idCard, String password) {
        return false;
    }
}