package Airport.Base;

public class Item{
    private String uuid;
    private int id;
    private String content;
    private double weight;

    public Item(String uuid, int id, String content, double weight){
        this.uuid = uuid;
        this.id = id;
        this.content = content;
        this.weight = weight;
    }

    public double getWeight(){
        return this.weight;
    }
}