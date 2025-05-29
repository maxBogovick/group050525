package lesson13.code.forLoop;

import lesson11.code.ifStatement.UserInputStatic;

public class ForDemo2 {
    public static void main(String[] args) {
        /*

        просуммировать все положительные числа из тех, которые ввел пользователь

        запросите у пользователя сколько чисел он планирует ввести

        в цикле запросите у пользователя число и если это число положительное,
        то прибавьте его к итоговой сумме, а если отрицательное - то проигнорируйте его
         */

        int numberOfIteration = UserInputStatic.inputInt("Введите количество чисел, которые планируете ввести: ");
        int finalSum = 0;


        for (int i = 0; i < numberOfIteration; i++) {
            int userData = UserInputStatic.inputInt("Введите число: ");

            if (userData > 0) {
                finalSum = finalSum + userData;
            }
        }

        System.out.println("Сумма только ПОЛОЖИТЕЛЬНЫХ чисел = " + finalSum);



    }
}
