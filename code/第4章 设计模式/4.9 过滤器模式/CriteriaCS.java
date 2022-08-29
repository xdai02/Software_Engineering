import java.util.ArrayList;
import java.util.List;

public class CriteriaCS implements Criteria {
    @Override
    public List<Student> filter(List<Student> students) {
        List<Student> csStudents = new ArrayList<Student>();
        for(Student student : students) {
            if(student.getMajor().equalsIgnoreCase("CS")) {
                csStudents.add(student);
            }
        }
        return csStudents;
    }
}
