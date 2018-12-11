package Airport.Scanner;

import Airport.Base.*;

import java.util.List;

public class ItemScanner extends AScanner implements IItemScanner {

    public ItemScanner(String uuid, String id, String type, StringSearchAlgorithm stringSearchAlgorithm, IReadingDevice readingDevice) {
        super(uuid, id, type, stringSearchAlgorithm, readingDevice);
    }

    @Override
    public boolean scan(Item item, String pattern) {
        if (employee != null) {
            if (stringSearcher.search(item.getContent(), pattern)) {
                return false;
            }
        }
        return true;
    }
}
