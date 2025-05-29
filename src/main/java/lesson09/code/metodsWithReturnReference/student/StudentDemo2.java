package lesson09.code.metodsWithReturnReference.student;

public class StudentDemo2 {
    public static void main(String[] args) {

        StudentService service = new StudentService();


        Student student1 = service.createNewStudent();
        Student student2 = service.createNewStudent();
        Student student3 = service.createNewStudent();


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }
}
