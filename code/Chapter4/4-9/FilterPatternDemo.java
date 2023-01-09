import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Terry", "male", "CS"));
        students.add(new Student("Bob", "male", "Math"));
        students.add(new Student("Anna", "female", "Food Science"));
        students.add(new Student("Lily", "female", "CS"));
        students.add(new Student("Alice", "female", "Art"));

        Criteria male = new CriteriaMale();
        Criteria cs = new CriteriaCS();
        Criteria maleAndCs = new AndCriteria(male, cs);
        Criteria maleOrCs = new OrCriteria(male, cs);

        System.out.println("MALE:");
        printStudents(male.filter(students));

        System.out.println("CS:");
        printStudents(cs.filter(students));

        System.out.println("Male and CS:");
        printStudents(maleAndCs.filter(students));

        System.out.println("Male or CS:");
        printStudents(maleOrCs.filter(students));
    }

    public static void printStudents(List<Student> students) {
        System.out.print("\t");
        for(Student student : students) {
            System.out.print(student.getName() + " ");
        }
        System.out.println();
    }
}
