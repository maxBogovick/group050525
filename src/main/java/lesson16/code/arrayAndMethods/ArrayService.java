package lesson16.code.arrayAndMethods;

import java.util.Random;

public class ArrayService {
        /*
        2) создайте массив нужной длины
        3) получите интервал для значений от пользователя
        4) заполните массив случайными числами из этого интервала
        5) вывести информацию о массиве на консоль
         */


    // создайте массив нужной длины

    public int[] createArray(int arraySize) {
        int[] arrayInteger = new int[arraySize];
        return arrayInteger;
    }

    // заполните массив случайными числами из этого интервала

    public void fillArrayByRandom(int startValue, int endValue, int[] arrayInteger) {

        Random random = new Random();

        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = random.nextInt(startValue, endValue + 1);
        }

        // нужно ли что-то возвращать???
        // поскольку в это метод передали ссылку на объект - массив
        // это означает, что этот объект уже был создан и находится где
        // в памяти java
        // получав доступ к это му объекту мы начинаем изменять его СОДЕРЖИМОЕ
        // но САМ ОБЪЕКТ (ссылка на него) остается той же самой

    }


    // вывести информацию о массиве на консоль

    public void printArray(int[] arrayInteger) {
        System.out.println("Значения элементов массива: ");
        for (int i = 0; i < arrayInteger.length; i++) {
            System.out.print(arrayInteger[i] + ", ");
        }

    }


    // создадим метод, который будет заполнять массив данными, полученными от пользователя

    public void fillArrayByUserInputData(int[] arrayInteger){
        // в цикле для каждого элемента запросим у пользователя данные
    }
}
