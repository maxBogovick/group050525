package lesson16.code.arrayAndMethods;

import lesson11.code.ifStatement.UserInputStatic;

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        /*
        1) Получите необходимую длину массива у пользователя
        2) создайте массив нужной длины
        3) получите интервал для значений от пользователя
        4) заполните массив случайными числами из этого интервала
        5) вывести информацию о массиве на консоль
         */

        // Получите необходимую длину массива у пользователя

        int arraySize = UserInputStatic.inputInt("Введите значение длины массива: ");

        // создайте массив нужной длины

        int[] arrayInteger = new int[arraySize];

        //  получите интервал для значений от пользователя

        int startValue = UserInputStatic.inputInt("Введите начало диапазона значений: ");
        int endValue = UserInputStatic.inputInt("Введите конец диапазона значений: ");

        // заполните массив случайными числами из этого интервала

        Random random = new Random();

        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = random.nextInt(startValue, endValue + 1);
            // arrayInteger[i] = random.nextInt(endValue - startValue + 1) + startValue;
        }

        // вывести информацию о массиве на консоль

        System.out.println("Значения элементов массива: ");
        for (int i = 0; i < arrayInteger.length; i++) {
            System.out.print(arrayInteger[i] + ", ");
        }



    }
}
