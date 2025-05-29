package lesson13.code.BreakAndContinue;

import lesson11.code.ifStatement.UserInputStatic;

public class BreakDemo2 {
    public static void main(String[] args) {

        String password = "";
        boolean condition = true;

     while (condition) {
         password = UserInputStatic.inputText("Введите пароль: ");

         if (password.length() < 8) {
             System.out.println("повторите ввод - неправильная длина пароля");
         } else {
             condition = false;
         }

     }

        System.out.println("Пароль принят");


    }
}
