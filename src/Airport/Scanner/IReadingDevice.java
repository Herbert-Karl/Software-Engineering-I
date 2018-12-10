package Airport.Scanner;

import Airport.Base.Baggage;
import Airport.Base.Employee;
import Airport.Base.IDCard;

public interface IReadingDevice {
    String version();
    boolean verify(IDCard idCard, String password);
}
