package lesson13.code.BreakAndContinue;

import lesson11.code.ifStatement.UserInputStatic;

public class BreakDemo {
    public static void main(String[] args) {
        /*
        break - прекращение работы цикла

         */

        String password = "";

        while (true) {
            password = UserInputStatic.inputText("Введите пароль: ");

            if (password.length() >= 8) {
                break;
            }

            System.out.println("повторите ввод - неправильная длина пароля");

        }

        System.out.println("Пароль принят");


    }
}
