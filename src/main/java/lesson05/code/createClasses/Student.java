package lesson05.code.createClasses;

public class Student {

    /*
    - номер студенческого билета
    - фамилия
    - имя
    - год рождения
    - номер группы
    - статус (учится или нет (отчислен))
     */

    // если номер - это только цифры - то тип данных может быть числовой int или long
    // если могут встречаться другие символы - то только String

    int studentId;
    String lastName;
    String firstName;
    int birthYear;
    String groupNumber;
    boolean isEnrolled;


}
