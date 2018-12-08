package Airport.Base;

import java.util.Stack;

public class Container{
    private String uuid;
    private ContainerType type;
    private String id;
    private ContainerCategory category;
    private ContainerProfile profile;
    private String barCodeIDCategory;
    private String qrCodeIDCategory;
    private Stack<Baggage> baggageList;

    public Container(String uuid, ContainerType type, String id, ContainerCategory category, ContainerProfile profile,
                     String barCodeIDCategory, String qrCodeIDCategory, Stack<Baggage> baggageList){
        this.uuid = uuid;
        this.type = type;
        this.id = id;
        this.category = category;
        this.profile = profile;
        this.barCodeIDCategory = barCodeIDCategory;
        this.qrCodeIDCategory = qrCodeIDCategory;
        this.baggageList = baggageList;
    }

    public ContainerType getType(){
        return this.type;
    }

    public double getWeight(){
        double weight = 0;
        Baggabe baggage = null;
        while(baggageList.peek != null){
           baggage = baggageList.pop();
           weight = weight + baggage.getWeight();
        }
        return weight;
    }

}