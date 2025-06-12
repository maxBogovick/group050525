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

        //Arrays.sort(arrayCat);
        // стандартная сортировка массива из элементов класса Cat
        // пока для нас не доступна, потому что мы не
        // объяснили (не научили) Java как сравнивать
        // объекты это типа - какой должен считаться больше или меньше
        // мы модем реализовать свой алгоритм сортировки, где
        // вместо сравнения элементов массива ('>') пропишем
        // свою логику и правили сравнения экземпляров класса Cat


        System.out.println(Arrays.toString(arrayCat));

    }
}
