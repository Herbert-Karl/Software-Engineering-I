package Airport.Security_Check;

public class Door implements IDoor {

    private boolean isOpen;

    public Door() {
        isOpen = false;
    }

    public Door(boolean isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public void close() {
        isOpen = false;
    }

    @Override
    public void open() {
        isOpen = true;
    }
}

