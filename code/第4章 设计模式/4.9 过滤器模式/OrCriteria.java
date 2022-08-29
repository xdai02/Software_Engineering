import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria1;
    private Criteria criteria2;

    public OrCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Student> filter(List<Student> students) {
        List<Student> list1 = criteria1.filter(students);
        List<Student> list2 = criteria2.filter(students);
        list1.removeAll(list2);
        list1.addAll(list2);
        return list1;
    }
}
