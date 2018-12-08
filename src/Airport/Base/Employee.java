package Airport.Base;

public class Employee{
    private String uuid;
    private int id;
    private String name;
    private Gender gender;
    private IDCard idCard;

    public Employee(int id, String name, Gender gender){
        this.uuid = uuid;
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.idCard = null;
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
    }

    public void setIdCard(IDCard idCard){
       this.idCard = idCard;
    }
}