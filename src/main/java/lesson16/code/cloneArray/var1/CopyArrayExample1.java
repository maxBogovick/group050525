package lesson16.code.cloneArray.var1;

import java.util.Arrays;

public class CopyArrayExample1 {
    public static void main(String[] args) {

        int [] arraySource = {1,2,3,4,5,6,7,8,9};

        // чтобы создать полную копию массива:
        // - создадим новый массив
        // - в цикле перенесем все данные из первого массива во второй

        int[] arrayCopy = new int[arraySource.length];

        for (int i = 0; i < arraySource.length; i++) {
            arrayCopy[i] = arraySource[i];
        }

        System.out.println(Arrays.toString(arraySource));
        System.out.println(Arrays.toString(arrayCopy));

        // изменим элемент из первого массива

        arraySource[1] = 100;
        arraySource[5] = 200;
        arraySource[7] = 300;

        System.out.println("Состояние данных в массивах после изменений:");
        System.out.println(Arrays.toString(arraySource));
        System.out.println(Arrays.toString(arrayCopy));

    }
}
