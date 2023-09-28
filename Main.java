import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Professor Ram = new Professor("ECE1002", "Ram", "SENSE", "ram123@gmail.com", 15000);
        Professor Melisa = new Professor("CSE1509", "Melisa", "SCOPE", "melisa1509@gmail.com", 20000);
        Professor Sam = new Professor("MEC1200","Sam", "MECH", "sam1200@gmail.com", 10000);

        Student Vicky = new Student("22BEC1064", "Vicky", "Electronic Engineering", "vicky1064@gmail.com", 9.56);
        Student Rohit = new Student("22CSE1500", "Rohit", "Computer Engineering", "rohit1500@gmail.com", 9.05);
        Student Chole = new Student("22MEC1001","Chole", "Mechanical Engineering", "chole1001@gmail.com", 8.99);
    
        List<Professor> professorList = new ArrayList<>();
        professorList.add(Melisa);
        professorList.add(Ram);
        professorList.add(Sam);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Chole);
        studentList.add(Vicky);
        studentList.add(Rohit);
        
        College VTI = new College(professorList, studentList);

        System.out.println(VTI.getProfessors());
        System.out.println(VTI.geStudents());
        
        System.out.println(VTI.getTotalProfessors());
        System.out.println(VTI.getTotalStudents());
    }
}
