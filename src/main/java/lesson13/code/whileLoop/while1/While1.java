package lesson13.code.whileLoop.while1;

import lesson11.code.ifStatement.UserInputStatic;

public class While1 {
    public static void main(String[] args) {
        /*
        Запросите у пользователя ввести два числа

        Вычислите их сумму и напечатайте

        Повторяйте это действие пока сумма будет меньше 100

         */

        double summa = 0;

        while (summa < 100){

            double number1 = UserInputStatic.inputDouble("Введите первой число: ");
            double number2 = UserInputStatic.inputDouble("Введите второе число: ");

            summa = number1 + number2;

            System.out.println("Сумма " + number1 + " и " + number2 + " равна " + summa);
        }

        System.out.println(" Вышли из цикла и завершили работу");

    }
}
