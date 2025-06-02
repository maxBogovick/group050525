package lesson16.code.CloneArray.var1;

import java.util.Arrays;

public class CopyArrayExample2Object {
    public static void main(String[] args) {

        Cat [] arraySource = {new Cat("Murzik"), new Cat("Barsik"), new Cat("Lucky")};

        // чтобы создать полную копию массива:
        // - создадим новый массив
        // - в цикле перенесем все данные из первого массива во второй

        Cat[] arrayCopy = new Cat[arraySource.length];

        for (int i = 0; i < arraySource.length; i++) {
            arrayCopy[i] = arraySource[i];
        }

        System.out.println(Arrays.toString(arraySource));
        System.out.println(Arrays.toString(arrayCopy));

        // попробуем внести изменения в массивы

        arraySource[1].setName("Рыжик");

        System.out.println("Состояние данных в массивах после изменений:");
        System.out.println(Arrays.toString(arraySource));
        System.out.println(Arrays.toString(arrayCopy));


        //

    }
}
