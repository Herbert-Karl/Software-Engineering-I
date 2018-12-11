package Airport.baggage_sorting_unit;

import Airport.airport.GateID;

import java.util.ArrayList;

public class ContainerLiftReceipt {
    private String uuid;
    private String containerLiftID;
    private GateID gateID;
    private int numberOfContainer;
    private ArrayList<String> containerIDList;

    public ContainerLiftReceipt(String uuid, String containerLiftID, GateID gateID, int numberOfContainer, ArrayList<String> containerIDList) {
        this.uuid = uuid;
        this.containerLiftID = containerLiftID;
        this.gateID = gateID;
        this.numberOfContainer = numberOfContainer;
        this.containerIDList = containerIDList;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getContainerLiftID() {
        return containerLiftID;
    }

    public void setContainerLiftID(String containerLiftID) {
        this.containerLiftID = containerLiftID;
    }

    public GateID getGateID() {
        return gateID;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public int getNumberOfContainer() {
        return numberOfContainer;
    }

    public void setNumberOfContainer(int numberOfContainer) {
        this.numberOfContainer = numberOfContainer;
    }

    public ArrayList<String> getContainerIDList() {
        return containerIDList;
    }

    public void setContainerIDList(ArrayList<String> containerIDList) {
        this.containerIDList = containerIDList;
    }
}
