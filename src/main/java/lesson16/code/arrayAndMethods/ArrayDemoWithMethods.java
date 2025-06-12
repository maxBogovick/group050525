package lesson16.code.arrayAndMethods;

import lesson11.code.ifStatement.UserInputStatic;

public class ArrayDemoWithMethods {
    public static void main(String[] args) {

         /*
        1) Получите необходимую длину массива у пользователя
        2) создайте массив нужной длины
        3) получите интервал для значений от пользователя
        4) заполните массив случайными числами из этого интервала
        5) вывести информацию о массиве на консоль
         */


        // создадим экземпляр класса ArrayService чтобы получить
        // возможность использовать его методы

        ArrayService arrayService = new ArrayService();


        // Получите необходимую длину массива у пользователя

        int arraySize = UserInputStatic.inputInt("Введите значение длины массива: ");

        // создайте массив нужной длины

        int[] arrayInteger = arrayService.createArray(arraySize);

        //  получите интервал для значений от пользователя

        int startValue = UserInputStatic.inputInt("Введите начало диапазона значений: ");
        int endValue = UserInputStatic.inputInt("Введите конец диапазона значений: ");

        // заполните массив случайными числами из этого интервала

        arrayService.fillArrayByRandom(startValue, endValue, arrayInteger);

        // вывести информацию о массиве на консоль

        arrayService.printArray(arrayInteger);

    }
}
