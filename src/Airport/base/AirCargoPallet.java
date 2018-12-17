package Airport.base;

public class AirCargoPallet {
    private String uuid;
    private String type;
    private String id;
    private Item[] itemList;
    private int maximumNumberOfItems;

    public AirCargoPallet(String uuid, String type, String id, Item[] itemList) {
        this.uuid = uuid;
        this.type = type;
        this.id = id;
        this.itemList = itemList;
        this.maximumNumberOfItems = 20000;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item[] getItemList() {
        return itemList;
    }

    public void setItemList(Item[] itemList) {
        this.itemList = itemList;
    }

    public int getMaximumNumberOfItems() {
        return maximumNumberOfItems;
    }

    public void setMaximumNumberOfItems(int maximumNumberOfItems) {
        this.maximumNumberOfItems = maximumNumberOfItems;
    }
}
