package Airport.scanner;

import Airport.base.Item;

public interface IItemScanner {
    boolean scan(Item item, String pattern);
}
