package lesson15.code.arrayExamples;

import java.util.Arrays;

public class ArrayExample3 {
    public static void main(String[] args) {

        int[] firstArray = {10,20,30,40,50,60,70,80,90,100};

        // задание: создайте НОВЫЙ массив в котором будут хранится значения
        // эти значения должны быть получены с помощью данных из первого массива, но деленные на 10
        // ожидаем, что получим результат: {1,2,3,4,5,6,7,8,9,10}

        // создаем новый массив нужной длины и потом заполняем каждый его элемент нужным значением

        int lengthFirstArray = firstArray.length;

        int[] secondArray = new int[lengthFirstArray];

        for (int i = 0; i < lengthFirstArray; i++) {
            secondArray[i] = firstArray[i] / 10;
        }
        /*
        начинаем цикл:
        значение i = 0
        значение lengthFirstArray = 10
        i < lengthFirstArray - true, значит мы выполняем тело цикла

        берем элемент с индексом ноль из первого массива, делим его на 10
        и полученный результат сохраняем в элемент с индексом 0 из второго массива

        secondArray[0] = firstArray[0] / 10;


        значение i = 1
        значение lengthFirstArray = 10
        i < lengthFirstArray - true, значит мы выполняем тело цикла

        берем элемент с индексом 1 из первого массива, делим его на 10
        и полученный результат сохраняем в элемент с индексом 1 из второго массива

        secondArray[1] = firstArray[1] / 10;

        ...

        значение i = 9
        значение lengthFirstArray = 10
        i < lengthFirstArray - true, значит мы выполняем тело цикла

        берем элемент с индексом 9 из первого массива, делим его на 10
        и полученный результат сохраняем в элемент с индексом 9 из второго массива

        secondArray[9] = firstArray[9] / 10;

          значение i = 10
        значение lengthFirstArray = 10
        i < lengthFirstArray - false, значит мы выходим из цикла


         */

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
    }
}
