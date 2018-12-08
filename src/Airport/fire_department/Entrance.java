package Airport.fire_department;

import java.util.ArrayList;
import java.util.List;

class Entrance {
    private EntranceID id;
    private List<Door> doorList = new ArrayList<>();
    private boolean isOpen;

    Entrance(EntranceID entranceID) {
        this.id = entranceID;
        for (DoorID doorID :
                DoorID.values()) {
            if (doorID.name().contains(entranceID.name().substring(1))) doorList.add(new Door(doorID));
        }

    }


    void open() {
        for (Door door :
                doorList) {
            door.open();
        }
        isOpen = true;
    }

    void close() {
        for (Door door :
                doorList) {
            door.open();
        }
        isOpen = false;
    }

}

