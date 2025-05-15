package lesson08.code.practice.students.var3;

import java.util.Scanner;

public class StudentService {

    public void changeStudentStatus(Student student){

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите новый статус студента: ");
        String newStatus = sc.nextLine();

        student.setStatus(newStatus);

        sc.close();
    }

}
