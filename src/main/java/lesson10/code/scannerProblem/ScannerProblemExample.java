package lesson10.code.scannerProblem;

import java.util.Scanner;

public class ScannerProblemExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int myInt = scanner.nextInt();
        /*
        методы у сканера nextInt(), nextDouble(), nextBoolean() и next()
        - не считывают перевод строки \n

         */
        scanner.nextLine();

        System.out.println("Вы ввели число: " + myInt);


        System.out.println("Введите текст: ");
        String text = scanner.nextLine();

        System.out.println("Вы ввели текст: " + text);


    }
}
