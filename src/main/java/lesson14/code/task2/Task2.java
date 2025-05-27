package lesson14.code.task2;

import lesson11.code.ifStatement.UserInputStatic;

public class Task2 {
    public static void main(String[] args) {
        /*
        запросите у пользователя пароль
        продолжать запрашивать до тех пор, пока пользователь не введет корректный

         */

        String correctPassword = "Pass12345";

        String userPassword = "";

        while (!userPassword.equals(correctPassword)){
            userPassword = UserInputStatic.inputText("Введите пароль:");

            if (!userPassword.equals(correctPassword)) {
                System.out.println("Вы ввели некорректный пароль! Повторите ввод.");
            }
        }

        // по логике если вы вышли из цикла, то это значит что пароль принят
        System.out.println("Пароль принят");



    }
}
