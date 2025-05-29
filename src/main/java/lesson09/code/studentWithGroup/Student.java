package lesson09.code.studentWithGroup;

public class Student {

    private String studentName;
    private String idCard;
    private Group group;

    public Student(String studentName, String idCard, Group group) {
        this.studentName = studentName;
        this.idCard = idCard;
        this.group = group;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getIdCard() {
        return idCard;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", group=" + group +
                '}';
    }
}
