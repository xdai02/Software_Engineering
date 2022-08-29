public class Student {
    private String name;
    private String gender;
    private String major;

    public Student(String name, String gender, String major) {
        this.name = name;
        this.gender = gender;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }
}
