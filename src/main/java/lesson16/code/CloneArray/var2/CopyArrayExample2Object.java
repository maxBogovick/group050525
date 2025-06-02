package lesson16.code.CloneArray.var2;

import java.util.Arrays;

public class CopyArrayExample2Object {
    public static void main(String[] args) {

        Cat[] arraySource = {new Cat("Murzik"), new Cat("Barsik"), new Cat("Lucky")};

        Cat[] arrayCopy = arraySource.clone();


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
