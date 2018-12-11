package Airport.Base;

import java.util.UUID;

public class Item{
    private String uuid;
    private int id;
    private String content;
    private double weight;

    public Item(int id, String content, double weight){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.id = id;
        this.content = content;
        this.weight = weight;
    }

    public double getWeight(){
        return this.weight;
    }
}