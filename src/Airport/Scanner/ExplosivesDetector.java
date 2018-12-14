package Airport.Scanner;

import Airport.Base.CottonPad;
import Airport.Base.Employee;
import Airport.Base.IDCard;

import java.util.List;
import java.util.Scanner;

public class ExplosivesDetector extends AScanner implements IExplosivesDetector {


    public ExplosivesDetector(String id, String type, StringSearchAlgorithm stringSearchAlgorithm, IReadingDevice readingDevice) {
        super(id, type, stringSearchAlgorithm, readingDevice);
    }

    @Override
    public boolean scan(CottonPad cottonPad) {
        return false;
        //HOW TO SCAN A COTTONPAD
    }
}
