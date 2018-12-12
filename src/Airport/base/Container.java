package Airport.base;

import java.util.Stack;

public class Container {
    private String uuid;
    private ContainerType type;
    private String id;
    private ContainerCategory category;
    private ContainerProfile profile;
    private String barCodeIDCategory;
    private String qrCodeIDCategory;
    private Stack<Baggage> baggageStack;

    public Container(String uuid, ContainerType type, String id, ContainerCategory category, ContainerProfile profile, String barCodeIDCategory, String qrCodeIDCategory, Stack<Baggage> baggageStack) {
        this.uuid = uuid;
        this.type = type;
        this.id = id;
        this.category = category;
        this.profile = profile;
        this.barCodeIDCategory = barCodeIDCategory;
        this.qrCodeIDCategory = qrCodeIDCategory;
        this.baggageStack = baggageStack;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ContainerType getType() {
        return type;
    }

    public void setType(ContainerType type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ContainerCategory getCategory() {
        return category;
    }

    public void setCategory(ContainerCategory category) {
        this.category = category;
    }

    public ContainerProfile getProfile() {
        return profile;
    }

    public void setProfile(ContainerProfile profile) {
        this.profile = profile;
    }

    public String getBarCodeIDCategory() {
        return barCodeIDCategory;
    }

    public void setBarCodeIDCategory(String barCodeIDCategory) {
        this.barCodeIDCategory = barCodeIDCategory;
    }

    public String getQrCodeIDCategory() {
        return qrCodeIDCategory;
    }

    public void setQrCodeIDCategory(String qrCodeIDCategory) {
        this.qrCodeIDCategory = qrCodeIDCategory;
    }

    public Stack<Baggage> getBaggageStack() {
        return baggageStack;
    }

    public void setBaggageStack(Stack<Baggage> baggageStack) {
        this.baggageStack = baggageStack;
    }
}
