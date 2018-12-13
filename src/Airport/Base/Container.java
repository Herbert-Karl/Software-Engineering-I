package Airport.Base;

import java.util.Stack;
import java.util.UUID;

public class Container{
    private String uuid;
    private ContainerType type;
    private String id;
    private ContainerCategory category;
    private ContainerProfile profile;
    private String barCodeIDCategory;
    private String qrCodeIDCategory;
    private Stack<Baggage> baggageList;

    public Container(ContainerType type, String id, ContainerCategory category, ContainerProfile profile,
                     String barCodeIDCategory, String qrCodeIDCategory, Stack<Baggage> baggageList){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.type = type;
        this.id = id;
        this.category = category;
        this.profile = profile;
        this.barCodeIDCategory = barCodeIDCategory;
        this.qrCodeIDCategory = qrCodeIDCategory;
        this.baggageList = baggageList;
    }

    ///
    /// Getter:
    ///

    public ContainerType getType(){
        return this.type;
    }

    public double getWeight(){
        double weight = 0;
        Stack<Baggage> temp = null;
        Baggage baggage = null;
        while((baggageList.peek()) != null){
            //stack ist leer
           baggage = baggageList.pop();
           weight = weight + baggage.getWeight();
           temp.push(baggage);
        }
        while((temp.peek() != null)){
            baggageList.push(temp.pop());
        }
        return weight;
    }

    public Stack<Baggage> getBaggageList() {
        return baggageList;
    }

    public String getUuid() {
        return uuid;
    }

    public String getId() {
        return id;
    }

    public String getBarCodeIDCategory() {
        return barCodeIDCategory;
    }

    public ContainerCategory getCategory() {
        return category;
    }

    public String getQrCodeIDCategory() {
        return qrCodeIDCategory;
    }

    public ContainerProfile getProfile() {
        return profile;
    }

    ///
    /// Setter:
    ///


    public void setBaggageList(Stack<Baggage> baggageList) {
        this.baggageList = baggageList;
    }
}