package lesson09.code.metodsWithReturnReference;

import lesson07.code.scanner.UserInput;

public class ManagerDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        String managerName1 = userInput.inputText("Введите имя пользователя");
        String managerEmail1 = userInput.inputText("Введите email пользователя");

        Manager manager1 = new Manager(managerName1, managerEmail1);

        System.out.println(manager1);


        String managerName2 = userInput.inputText("Введите имя пользователя");
        String managerEmail2 = userInput.inputText("Введите email пользователя");

        Manager manager2 = new Manager(managerName2, managerEmail2);

        System.out.println(manager2);


    }
}
