import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Student> filter(List<Student> students) {
        List<Student> maleStudents = new ArrayList<Student>();
        for(Student student : students) {
            if(student.getGender().equalsIgnoreCase("MALE")) {
                maleStudents.add(student);
            }
        }
        return maleStudents;
    }
}
