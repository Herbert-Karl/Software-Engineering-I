package Airport.fire_department;

import java.util.ArrayList;

public class Entrance {
    private EntranceID id;
    private ArrayList<Door> doorList;
    private boolean isOpen;

    public Entrance(EntranceID id, ArrayList<Door> doorList, boolean isOpen) {
        this.id = id;
        this.doorList = doorList;
        this.isOpen = isOpen;
    }

    public void open() {

    }

    public void close() {

    }

    public EntranceID getId() {
        return id;
    }

    public void setId(EntranceID id) {
        this.id = id;
    }

    public ArrayList<Door> getDoorList() {
        return doorList;
    }

    public void setDoorList(ArrayList<Door> doorList) {
        this.doorList = doorList;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
