package Airport.fire_department;

class Door {
    private DoorID id;
    private boolean isOpen = false;


    Door(DoorID id) {
        this.id = id;
    }

    void open() {
        isOpen = true;
    }

    void close() {
        isOpen = false;
    }
}
