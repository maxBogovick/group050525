package lesson08.code.practice.students.var2;

import java.util.Scanner;

public class Student {
    private String studentName;
    private String group;
    private String status;

    public Student(String studentName, String group, String status) {
        this.studentName = studentName;
        this.group = group;
        this.status = status;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getGroup() {
        return group;
    }

    public String getStatus() {
        return status;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", group='" + group + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    // в этом варианте - создадим отдельно метод: который будет запрашивать у пользователя новый статус

    public void changeStatus(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите новый статус студента: ");
        status = sc.nextLine();
        sc.close();
    }

}
