package lesson13.code.practice;

import lesson11.code.ifStatement.UserInputStatic;

public class Task2 {
    public static void main(String[] args) {

        int count = UserInputStatic.inputInt("Сколько чисел вы хотите ввести?");

        for (int i = 0; i < count; i++) {

            int userNumber = UserInputStatic.inputInt("Введите число: ");

            // проверка: если число отрицательное и нечетное

            if (userNumber < 0 && userNumber % 2 != 0) {
                System.out.println("Ошибка ввода данных!");
            } else {
                System.out.println("Вы ввели : " + userNumber);
            }
        }
    }
}
