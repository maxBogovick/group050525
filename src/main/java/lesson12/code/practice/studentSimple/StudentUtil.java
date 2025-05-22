package lesson12.code.practice.studentSimple;

import lesson11.code.ifStatement.UserInputStatic;

public class StudentUtil {

    public Student createStudent(String message){

        System.out.println(message);
        String surname = UserInputStatic.inputText("Введите фамилию студента: ");
        String name = UserInputStatic.inputText("Введите имя студента: ");
        String idCard = UserInputStatic.inputText("Введите ID студента: ");
        String group = UserInputStatic.inputText("Введите группу студента: ");

        return new Student(surname,name,idCard,group);

    }
}
