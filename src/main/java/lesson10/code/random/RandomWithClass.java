package lesson10.code.random;

import java.util.Random;

public class RandomWithClass {
    public static void main(String[] args) {

        Random myRandom = new Random();


        int random = myRandom.nextInt();
        System.out.println(random);
        // nextInt() - возвращает любое случайное целое число в диапазоне чисел int

        // если я хочу получить значение в диапазоне от [0 до n) то вызываем метод nextInt(n)

        int startDiapazon = 10;
        int endDiapazon = 15;


        int random2 = myRandom.nextInt(startDiapazon,endDiapazon);

        System.out.println(random2);
    }
}
