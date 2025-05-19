package lesson09.code.studentWithGroup;

public class StudentDemo {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        // первым шагом - создаем группу
        Group group1 = studentService.createNewGroup();

        System.out.println(group1);

        // теперь можем создавать студентов

        Student student1 = studentService.createStudent(group1);

        System.out.println(student1);

    }
}
