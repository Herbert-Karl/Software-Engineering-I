public class Employee{
    private String uuid;
    private int id;
    private String name;
    private Gender gender;
    private IDCard idCard;

    public Employee(String uuid, int id, String name, Gender gender, IDCard idCard){
        this.uuid = uuid;
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.idCard = idCard;
    }
}