

public class Professor {
    private String Id;
    private String Name;
    private String Department;
    private String email;
    private int salary;

    public Professor(String Id, String Name, String Department, String email, int salary){
        this.Id = Id;
        this.Name = Name;
        this.Department = Department;
        this.email = email;
        this.salary = salary;
    }
     
    public void setSalary(int salary){
        this.salary = salary;
    }

    // Getters
    public String getId(){
        return Id;
    }
    public String getName(){
        return Name;
    }
    public String Department(){
        return Department;
    }
    public String getEmail(){
        return email;
    }
    public int getSalary(){
        return salary;
    }
}
