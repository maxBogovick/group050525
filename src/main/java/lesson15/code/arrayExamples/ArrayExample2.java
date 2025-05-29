package lesson15.code.arrayExamples;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {

        int[] firstArray = {10,20,30,40,50,60,70,80,90,100};

        // задание: создайте НОВЫЙ массив в котором будут хранится значения
        // эти значения должны быть получены с помощью данных из первого массива, но деленные на 10
        // ожидаем, что получим результат: {1,2,3,4,5,6,7,8,9,10}

        // создаем новый массив нужной длины и потом заполняем каждый его элемент нужным значением

        int lengthFirstArray = firstArray.length;

        int[] secondArray = new int[lengthFirstArray];

        secondArray[0] = firstArray[0] / 10;
        secondArray[1] = firstArray[1] / 10;
        secondArray[2] = firstArray[2] / 10;
        secondArray[3] = firstArray[3] / 10;
        secondArray[4] = firstArray[4] / 10;
        secondArray[5] = firstArray[5] / 10;
        secondArray[6] = firstArray[6] / 10;
        secondArray[7] = firstArray[7] / 10;
        secondArray[8] = firstArray[8] / 10;
        secondArray[9] = firstArray[9] / 10;

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));


        int[] thirdArray = {
                firstArray[0] / 10,
                firstArray[1] / 10,
                firstArray[2] / 10,
                firstArray[3] / 10,
                firstArray[4] / 10,
                firstArray[5] / 10,
                firstArray[6] / 10,
                firstArray[7] / 10,
                firstArray[8] / 10,
                firstArray[9] / 10
        };

        System.out.println(Arrays.toString(thirdArray));


    }
}
