package lesson12.code.practice.studentSimple;

import java.util.Objects;

public class Student {

    private String surname;
    private String name;
    private String idNumber;
    private String group;

    public Student(String surname, String name, String idNumber, String group) {
        this.surname = surname;
        this.name = name;
        this.idNumber = idNumber;
        this.group = group;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getGroup() {
        return group;
    }

    public void printStudentInfo() {
        System.out.println("----------------");
        System.out.println("Информация о студенте: ");
        System.out.println("Фамилия: " + surname + ", Имя: " + name);
        System.out.println("Номер билета: " + idNumber);
        System.out.println("Группа: " + group);
    }

    public boolean compareStudent(Student anotherStudent) {
        boolean compareResult =
                surname.equals(anotherStudent.getSurname()) &&
        name.equals(anotherStudent.getName()) &&
                idNumber.equals(anotherStudent.getIdNumber());

        return compareResult;
    }

    // переопределим стандартный метод equals()


    @Override
    public boolean equals(Object anotherObject) {
        if (!(anotherObject instanceof Student student)) return false;
        return surname.equals(student.surname) && name.equals(student.name) && idNumber.equals(student.idNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, idNumber);
    }
}
