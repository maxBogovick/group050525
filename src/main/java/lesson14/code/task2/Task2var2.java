package lesson14.code.task2;

import lesson11.code.ifStatement.UserInputStatic;

public class Task2var2 {
    public static void main(String[] args) {
        /*
        запросите у пользователя пароль
        продолжать запрашивать до тех пор, пока пользователь не введет корректный

         */

        // создали корректный пароль
        String correctPassword = "Pass12345";

        String userPassword;
        // создаем цикл в котором будем запрашивать пароль от пользователя


        do{
            userPassword = UserInputStatic.inputText("Введите пароль: ");

            if (!userPassword.equals(correctPassword)){
                System.out.println("Пароль не корректный. Повторите ввод.");
            }
        } while (!userPassword.equals(correctPassword));

        System.out.println("Пароль принят");


    }
}
