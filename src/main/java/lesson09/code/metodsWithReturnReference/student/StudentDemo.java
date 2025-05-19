package lesson09.code.metodsWithReturnReference.student;

import lesson07.code.scanner.UserInput;

public class StudentDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        String firstName1 = userInput.inputText("Введите имя студента: ");
        String lastName1 = userInput.inputText("Введите фамилию студента: ");
        String idCard1 = userInput.inputText("Введите Id карту студента: ");
        String group1 = userInput.inputText("Введите группу студента: ");

        Student student1 = new Student(firstName1,lastName1,idCard1,group1);

        String firstName2 = userInput.inputText("Введите имя студента: ");
        String lastName2 = userInput.inputText("Введите фамилию студента: ");
        String idCard2 = userInput.inputText("Введите Id карту студента: ");
        String group2 = userInput.inputText("Введите группу студента: ");

        Student student2 = new Student(firstName2,lastName2,idCard2,group2);

        String firstName3 = userInput.inputText("Введите имя студента: ");
        String lastName3 = userInput.inputText("Введите фамилию студента: ");
        String idCard3 = userInput.inputText("Введите Id карту студента: ");
        String group3 = userInput.inputText("Введите группу студента: ");

        Student student3 = new Student(firstName3,lastName3,idCard3,group3);


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);



    }
}
