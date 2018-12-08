package Airport.Scanner;

import Airport.Base.IDCard;

public class ReadingDevice implements IReadingDevice {
    private String uuid;
    private String type;
    private String id;
    private IDCard idCard;

    @Override
    public String version() {
        return null;
    }

    @Override
    public boolean verify(IDCard idCard, String password) {
        return false;
    }
}
