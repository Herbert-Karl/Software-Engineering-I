package Airport.scanner;

import Airport.base.IDCard;

public interface IReadingDevice {
    String version();
    boolean verify(IDCard idCard, String password);
}
