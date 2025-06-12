package lesson16.code.studentArray;

import java.util.Arrays;

public class StudentDemo {
    /*
    Создайте несколько студентов
    Создайте массив студентов
    Найти сколько студентов у кого имя начинается на "А"
    вывести на экран всех студентов и количество с именем на "А"
     */

    public static void main(String[] args) {

        Student student1 = new Student("Ruslan", "group1");
        Student student2 = new Student("Olga", "group1");
        Student student3 = new Student("Victor", "group2");
        Student student4 = new Student("Roman", "group2");
        Student student5 = new Student("Alex", "group1");
        Student student6 = new Student("Yuriy", "group2");


        // создадим массив всех студентов

        Student[] students = {student1,student2,student3,student4,student5,student6};

        // создадим массив по группам

        Student[] group1 = {student1,student2,student5};
        Student[] group2 = {student3,student4,student6};


        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(group1));
        System.out.println(Arrays.toString(group2));


        // а теперь давайте поменяем группу у студента


        students[3].setGroupName("group1");

        System.out.println("После перевода студента из одной группы в другую:");
        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(group1));
        System.out.println(Arrays.toString(group2));


    }
}
