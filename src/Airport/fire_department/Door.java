package Airport.fire_department;

public class Door {
    private DoorID id;
    private boolean isOpen;

    public Door(DoorID id, boolean isOpen) {
        this.id = id;
        this.isOpen = isOpen;
    }

    public void open() {

    }

    public void close() {

    }

    public DoorID getId() {
        return id;
    }

    public void setId(DoorID id) {
        this.id = id;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
