package lesson16.code.cloneArray.var2;

import java.util.Arrays;

public class CopyArrayExample1 {
    public static void main(String[] args) {

        int [] arraySource = {1,2,3,4,5,6,7,8,9};

        // чтобы создать полную копию массива:
        // используем метод clone()
        int[] arrayCopy = arraySource.clone();

        // создается "поверхностная" копия, то есть
        // копируются ЗНАЧЕНИЯ, которые хранятся в массиве-исходнике


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
