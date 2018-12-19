package Airport.Scanner;

import Airport.Base.IDCard;

import java.util.Random;
import java.util.UUID;

public class ReadingDevice implements IReadingDevice {
    private String uuid;
    private String id;
    private String type;

    public ReadingDevice(String type) {
        this.uuid = UUID.randomUUID().toString();
        this.type = type;
        this.id = Integer.toString(new Random().nextInt());
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