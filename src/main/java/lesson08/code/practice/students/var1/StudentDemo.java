package lesson08.code.practice.students.var1;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Ruslan","010101","зачислен");

        System.out.println(student1);

        // --- изменим статус студента ---

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите новый статус студента: ");
        String newStatus = sc.nextLine();

        // student1.status = newStatus; - невозможно так как поле private
        student1.setStatus(newStatus);

        System.out.println("Информация о студенте после обновления данных:");
        System.out.println(student1);
    }
}
