package lesson13.code;

import lesson11.code.ifStatement.UserInputStatic;

public class Example1 {
    public static void main(String[] args) {
        int number1 = UserInputStatic.inputInt("Введите первое число: ");
        int number2 = UserInputStatic.inputInt("Введите второе число: ");
        int number3 = UserInputStatic.inputInt("Введите третье число: ");

        double average = (number1 + number2 + number3) / 3.0;

        System.out.println("Среднее арифметическое значение = " + average);
    }
}
