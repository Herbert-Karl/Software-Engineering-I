package Airport.Base;

import Airport.Base.Item;

public class AirCargoPallet{
    private String uuid;
    private String type;
    private String id;
    private Item[] itemList;
    private int maximumNumberOfItems = 2000;

    public AirCargoPallet(String uuid, String type, String id){
        this.uuid = uuid;
        this.type = type;
        this.id = id;
    }

    public void setItemList(Item[] itemList) {
        this.itemList = itemList;
    }

    public double getWeight(){
        double weight = 0;
        int listLengh = itemList.length;
        for(int a = 0; a<listLengh; a++){
          Item item =  itemList[a];
          weight = weight + item.getWeight();
        }
        return weight;
    }

    ///
    /// Getter:
    ///

    public String getUuid() {
        return uuid;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Item[] getItemList() {
        return itemList;
    }
}