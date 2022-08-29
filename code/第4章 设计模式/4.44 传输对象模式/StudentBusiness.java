import java.util.ArrayList;
import java.util.List;

public class StudentBusiness {
    // working as a database
    private List<Student> students;

    public StudentBusiness() {
        students = new ArrayList<>();
        students.add(new Student(0, "Terry"));
        students.add(new Student(1, "Henry"));
        students.add(new Student(2, "Lily"));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        return students.get(id);
    }

    public void removeStudent(Student student) {
        students.remove(student.getId());
        System.out.println("Student (id=" + student.getId() + ") DELETED.");
    }

    public void updateStudent(Student student) {
        students.get(student.getId()).setName(student.getName());
        System.out.println("Student (id=" + student.getId() + ") UPDATED.");
    }
}
