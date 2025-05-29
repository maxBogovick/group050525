package lesson09.code.metodsWithReturnReference.student;

public class Student {
    private String firstName;
    private String lastName;
    private String studentCardNumber;
    private String group;

    public Student(String firstName, String lastName, String studentCardNumber, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentCardNumber = studentCardNumber;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Имя студента: " + firstName + ", \n" +
                "Фамилия студента :" + lastName + ", \n" +
                "studentCardNumber :" + studentCardNumber + ", \n" +
                "group :" + group + '}';
    }
}
