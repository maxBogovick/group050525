package lesson14.code.task3;

import lesson11.code.ifStatement.UserInputStatic;

public class Task3 {
    public static void main(String[] args) {
        /*
        запросите у пользователя пароль
        продолжать запрашивать до тех пор, пока пользователь не введет корректный
        НО у пользователя ограниченное количество попыток (например 5)
         */

        String correctPassword = "Pass12345";

        String userPassword = "";

        int attemptCounter = 5;

        boolean isPasswordAccepted = false;

        while (!isPasswordAccepted){
            userPassword = UserInputStatic.inputText("Введите пароль:");

            if (!userPassword.equals(correctPassword)) {
                System.out.println("Вы ввели некорректный пароль! Повторите ввод.");
                attemptCounter--;
            } else {
                isPasswordAccepted = true;
            }

            if (attemptCounter == 0) {
                System.out.println("Вы использовали все попытки!");
                break;
            }
        }

        // по логике если вы вышли из цикла, то это значит что
        // - либо пароль принят
        // - либо что закончилось количество попыток

        if (isPasswordAccepted) {
        System.out.println("Пароль принят");
        } else {
            System.out.println("Доступ закрыт!");
        }



    }
}
