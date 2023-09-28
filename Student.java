
public class Student{
    private String Id;
    private String Name;
    private double CGPA;
    private String email;
    private String Course;

    // Initialise a New Student
    public Student(String Id, String Name, String course, String email, double CGPA){
        this.Id = Id;
        this.Name = Name;
        this.Course = course;
        this.email = email;
        this.CGPA = CGPA;
    }
    
    public void setCGPA(double CGPA){
        this.CGPA = CGPA;
    }
    
    // Getters
    public String getName() {
        return Name;
    }
    public String getId(){
        return Id;
    }
    public double getCGPA(){
        return CGPA;
    }
    public String getEmail(){
        return email;
    }
    public String getCourse(){
        return Course;
    }

}