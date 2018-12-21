package Airport.Baggage_Sorting_Unit.Receipts;

import Airport.Airport.GateID;

import java.util.ArrayList;
import java.util.UUID;

public class ContainerLifterReceipt {

    private final String uuid;

    private final String containerLifterID;

    private final GateID gateID;

    private final int numberOfContainer;

    private final ArrayList<String> containerIDList;

    public ContainerLifterReceipt(String containerLifterID, GateID gateID, int numberOfContainer, ArrayList<String> containerIDList) {
        this.uuid = UUID.randomUUID().toString();
        this.containerLifterID = containerLifterID;
        this.gateID = gateID;
        this.numberOfContainer = numberOfContainer;
        this.containerIDList = containerIDList;
    }

    @Override
    public String toString() {
        return ("UUID: " + uuid + "\nContainer lifter's ID: " + containerLifterID + "\nID of Gate: " + gateID + "\nNumber of container: "
                + numberOfContainer + "\nContainers' IDs: " + containerIDList);
    }
}
