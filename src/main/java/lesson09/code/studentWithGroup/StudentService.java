package lesson09.code.studentWithGroup;

import lesson07.code.scanner.UserInput;

public class StudentService {


    public Group createNewGroup() {
        UserInput userInput = new UserInput();

        String groupName = userInput.inputText("Введите название группы: ");
        String groupDataStart = userInput.inputText("Введите дату начала занятий группы: ");
        int groupCount = 0;

        Group group = new Group(groupName,groupDataStart,groupCount);

        return group;
    }


    public Student createStudent(Group group) {
        UserInput userInput = new UserInput();

        String studentName = userInput.inputText("Введите имя студента:");
        String studentIdCard = userInput.inputText("Введите id карту студента: ");

        Student student = new Student(studentName,studentIdCard,group);

        return student;

    }

}
