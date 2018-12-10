package Airport.Security_Check;

public class Door implements IDoor {

    private boolean isOpen;

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public void close() {

    }
    @Override
    public void open() {

    }
}
