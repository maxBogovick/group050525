package lesson12.code.practice.studentSimple;

public class StudentDemo {
    public static void main(String[] args) {
        StudentUtil studentUtil = new StudentUtil();

        Student student1 = studentUtil.createStudent("Введите данные для первого студента");
        Student student2 = studentUtil.createStudent("Введите данные для второго студента");
        Student student3 = studentUtil.createStudent("Введите данные для третьего студента");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();


        // проверим на "одинаковость" у студента 1 и студента 2
        // сами вручную проверяем(сравниваем) поля surnamе, name и idNumber

//        if (
//                (student1.getSurname().equals(student2.getSurname())) &&
//                        (student1.getName().equals(student2.getName())) &&
//                        (student1.getIdNumber().equals(student2.getIdNumber()))
//        ) {
//            System.out.println("Студенты одинаковые");
//        }

        //такая реализация - сложное, громоздкое и тяжело читаемое конструкция -
        // можем создать отдельный метод для реализации сравнения

//        if (student1.compareStudent(student2)) {
//            System.out.println("Студенты одинаковые");
//        }

        // после переопределения метода equals() будем использовать его

        if (student1.equals(student2)) {
            System.out.println("Студенты одинаковые");
        }


    }
}
