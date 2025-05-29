package lesson13.code.whileLoop.while5;

import lesson11.code.ifStatement.UserInputStatic;

public class WhileDemo5 {
    public static void main(String[] args) {
        /*
        Задача: вычислить сумму всех положительных чисел, введенных пользователем.

        Запросите у пользователя число, если число положительное, то прибавьте его
        к итоговой сумме. Если число отрицательное - то напечатайте итог и
        завершите работу приложения.
         */

        int finalSumm = 0;

        boolean condition = true;

        while (condition){
            int userNumber = UserInputStatic.inputInt("Введите целое число: ");

            if (userNumber >= 0) {
                finalSumm = finalSumm + userNumber;
            } else {
                condition = false;
            }
        }

        System.out.println("Итоговая сумма всех положительных чисел, введенных пользователем = " + finalSumm);


    }
}
