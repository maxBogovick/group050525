package lesson08.code.practice.students.var3;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {

        StudentService ourService = new StudentService();

        // ---------------------
        Student student1 = new Student("Ruslan","010101","зачислен");

        System.out.println(student1);

        // --- изменим статус студента ---

        ourService.changeStudentStatus(student1);

        // ----- заново распечатаем информацию -------

        System.out.println("Информация о студенте после обновления данных:");
        System.out.println(student1);
    }
}
