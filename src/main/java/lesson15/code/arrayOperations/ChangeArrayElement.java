package lesson15.code.arrayOperations;

import java.util.Arrays;

public class ChangeArrayElement {
    public static void main(String[] args) {
        // предположим, что у нас уже задан массив с данными

        int[] intArray = {5, 2, 7, 9, 12, 4, 3, 25, 8, 11};

        System.out.println(Arrays.toString(intArray));

        // задача: взять каждый элемент массива и если его значение - четное, то заменить его на 0

        for (int i = 0; i < intArray.length; i++) {
            // в цикле проходимся по всем элементам массива по очереди
            // берем очередной элемент и проверяем
            // если значение этого элемента является четным (остаток от деления на 2 равен нулю)
            // то в этот элемент нужно сохранить новое значение (по условию задачи - 0)

            if (intArray[i] % 2 == 0) {
                intArray[i] = 0;
            }
        }
        // завершили цикл


        System.out.println(Arrays.toString(intArray));
    }
}
