package lesson17.code.javaStandartSort;

import java.util.Arrays;

public class SortCatArrayExample {
    public static void main(String[] args) {
        Cat[] arrayCat = {
                new Cat("Barsik",3),
                new Cat("Murzik",2),
                new Cat("Lucky",5)

        };

        System.out.println(Arrays.toString(arrayCat));

        Arrays.sort(arrayCat);

        System.out.println(Arrays.toString(arrayCat));

    }
}
