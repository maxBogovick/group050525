package lesson15.code.arrayExamples;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
        // объявим массив
        // создай новй объект - массив целых чисел из трех элементов
        // сохрани ссылку на него в переменную myArray

        int[] myArray = new int[3];

        // заполним массив
        // нумерация элементов массива начинается с 0
        myArray[0] = 6;
        myArray[1] = 9;
        myArray[2] = 11;

        //печать содержимого нашего массива (всех элементов)

        System.out.println(Arrays.toString(myArray));

        // а как можно использовать значения, которые хранятся в массиве?

        int sumAllElements = myArray[0] + myArray[1] + myArray[2];

        System.out.println("Сумма всех элементов массива: " + sumAllElements);

        // а можно ли изменять значения элементов массива?
        // работа с каждой ячейкой (элементом) массива осуществляется
        // ТОЧНО ТАКЖЕ, как и работа с обычной переменной
        // отличие только в том, что обращаемся по номеру элемента

        // заменим (обновим) значение нулевого элемента массива

        myArray[0] = 25;

        // распечатаем наш массив (с обновленными значениями)

        System.out.println(Arrays.toString(myArray));

        System.out.println();

        // сравнение элементов массива

        System.out.println("Сравнение элементов массива:");
        myArray[2] = 25;
        System.out.println(myArray[0] == myArray[1]);
        System.out.println(myArray[0] == myArray[2]);


        // создадим массив строк

        System.out.println();
        System.out.println("Массив слов: ");
        String[] stringArray = {"word 1","word 2","word 3","word 1"};

        System.out.println(Arrays.toString(stringArray));

        // сравнение строк по их содержимому (по буквам) осуществляется с помощью метода equals()

        System.out.println(stringArray[0].equals(stringArray[1]));
        System.out.println(stringArray[0].equals(stringArray[3]));

        System.out.println(stringArray[0] + stringArray[1]);

        System.out.println("Длина текста в нулевой ячейке: " + stringArray[0].length());

    }
}
