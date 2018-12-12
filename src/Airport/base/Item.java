package Airport.base;

public class Item {
    private String uuid;
    private int id;
    private String content;
    private double weight;

    public Item(String uuid, int id, String content, double weight) {
        this.uuid = uuid;
        this.id = id;
        this.content = content;
        this.weight = weight;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
