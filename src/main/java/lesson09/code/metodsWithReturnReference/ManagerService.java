package lesson09.code.metodsWithReturnReference;

import lesson07.code.scanner.UserInput;

public class ManagerService {


    public Manager createManager() {
        UserInput userInput = new UserInput();

        String managerName = userInput.inputText("Введите имя пользователя");
        String managerEmail = userInput.inputText("Введите email пользователя");

        Manager manager = new Manager(managerName, managerEmail);

        return manager;

    }

}
