package Airport.Base;

public class IDCard{
    private String uuid;
    private Employee employee;
    private String password;

    public IDCard(){
        this.uuid = uuid;
        this.employee = null;
        this.password = "SHA-265";
        UUID uuid = UUID.randomUUID();
        this uuid = uuid.toString();
    }

    public void setEmployee(Employee employee){
       this.employee = employee;
    }
}