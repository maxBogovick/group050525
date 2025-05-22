package lesson12.code;

import lesson11.code.ifStatement.UserInputStatic;

public class SwitchExample {
    public static void main(String[] args) {

        int userNumber = UserInputStatic.inputInt("Введите число: ");

        switch (userNumber) {
            case 0:
                System.out.println("Вы ввели 0");
                break;
            case 1:
                System.out.println("Вы ввели 1");
                break;
            case 2:
                System.out.println("Вы ввели 2");
                break;
            case 3:
                System.out.println("Вы ввели 3");
                break;
            case 4:
                System.out.println("Вы ввели 4");
                break;
            default:
                System.out.println("EXIT");
        }

        System.out.println("Программа завершила свою работу");
    }
}
