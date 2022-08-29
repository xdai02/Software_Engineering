public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBusiness studentBusiness = new StudentBusiness();

        for(Student student : studentBusiness.getAllStudents()) {
            System.out.println(student);
        }

        Student student1 = studentBusiness.getStudentById(1);
        student1.setName("Alice");
        studentBusiness.updateStudent(student1);

        Student student2 = studentBusiness.getStudentById(0);
        studentBusiness.removeStudent(student2);

        for(Student student : studentBusiness.getAllStudents()) {
            System.out.println(student);
        }
    }
}
