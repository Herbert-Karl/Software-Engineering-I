package Airport.Scanner;

import Airport.Base.IDCard;

import java.util.UUID;

public class ReadingDevice implements IReadingDevice {
    private String uuid;
    private String id;
    private String type;

    public ReadingDevice(String id, String type) {
        this.uuid = UUID.randomUUID().toString();
        this.type = type;
        this.id = id;
    }

    @Override
    public String version() {
        return "<" + id + "> - <" + type + ">";
    }


    @Override
    public boolean verify(IDCard idCard, String password) {
        return idCard.getPassword().equals(password);
    }
}