package Airport.Scanner;

import Airport.Base.CottonPad;
import Airport.Base.Employee;
import Airport.Base.IDCard;

import java.util.List;
import java.util.Scanner;

public class ExplosivesDetector extends AScanner implements IExplosivesDetector {


    public ExplosivesDetector(String id, String type, StringSearchAlgorithm stringSearchAlgorithm) {
        super(type, stringSearchAlgorithm, new ReadingDevice(type + " Reader"));
    }

    @Override
    public boolean scan(CottonPad cottonPad) {
        if (employee != null) {
            if (stringSearcher.search(cottonPad.getSurface(), "explosive")) {
                return false;
            }
        }
        return true;
    }
}
