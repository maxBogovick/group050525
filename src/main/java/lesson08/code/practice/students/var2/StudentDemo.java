package lesson08.code.practice.students.var2;


public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Ruslan","010101","зачислен");

        System.out.println(student1);

        student1.changeStatus();

        System.out.println("Информация о студенте после обновления данных:");
        System.out.println(student1);
    }
}
