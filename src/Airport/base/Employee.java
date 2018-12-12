package Airport.base;

public class Employee {
    private String uuid;
    private int id;
    private String name;
    private Gender gender;
    private IDCard idCard;

    public Employee(String uuid, int id, String name, Gender gender, IDCard idCard) {
        this.uuid = uuid;
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.idCard = idCard;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }
}
