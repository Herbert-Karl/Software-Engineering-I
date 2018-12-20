package Airplane.cabin;

public class WasteSystem extends System implements IWasteSystem {
    private String[] waste;

    // constructor
    public WasteSystem() {
        super("WasteSystem");
        waste = new String[100];
    }

    @Override
    // returns the size of the array
    public int deposit(String[] waste) {
        return waste.length;
    }
}
