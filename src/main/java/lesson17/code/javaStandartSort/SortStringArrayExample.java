package lesson17.code.javaStandartSort;

import java.util.Arrays;

public class SortStringArrayExample {
    public static void main(String[] args) {
        String[] arrayInt = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(arrayInt));

        Arrays.sort(arrayInt);

        System.out.println(Arrays.toString(arrayInt));

    }
}
