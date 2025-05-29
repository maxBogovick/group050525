package lesson09.code.metodsWithReturnReference.student;

import lesson07.code.scanner.UserInput;

public class StudentService {

    public Student createNewStudent(){
        UserInput userInput = new UserInput();

        String firstName = userInput.inputText("Введите имя студента: ");
        String lastName = userInput.inputText("Введите фамилию студента: ");
        String idCard = userInput.inputText("Введите Id карту студента: ");
        String group  = userInput.inputText("Введите группу студента: ");

        Student student = new Student(firstName,lastName,idCard,group);

        return student;
    }
}
