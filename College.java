import java.util.List;

public class College {
    private List<Professor> professors;
    private List<Student> students;
    private int totalStudents;
    private int totalProfessors;

    public College(List<Professor> professors, List<Student> students){
        this.professors = professors;
        this.students = students;
        totalProfessors = professors.size();
        totalStudents = students.size();
    }
    // Adding Professor and Students
    public void addProfessor(Professor professor){
        professors.add(professor);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    // Getters 
    public List<Professor> getProfessors(){
        return professors;
    }

    public List<Student> geStudents(){
        return students;
    }
    
    public int getTotalStudents(){
        return totalStudents;
    }
    
    public int getTotalProfessors(){
        return totalProfessors;
    }
}

