package Base;

public class IDCard{
    private String uuid;
    private Employee employee;
    private String password;

    public IDCard(String uuid, Employee employee){
        this.uuid = uuid;
        this.employee = employee;
        this.password = "SHA-265";
    }
}