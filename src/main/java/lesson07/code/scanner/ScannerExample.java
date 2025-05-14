package lesson07.code.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter text message: ");
        String inputMessage = sc.nextLine();
        System.out.println("Your text: " + inputMessage);

        System.out.println("Введите целое число: ");
        int intNumber = sc.nextInt();
        System.out.println("Вы введи число: " + intNumber);

        System.out.println("Введите число с плавающей точкой: ");
        double doubleNumber = sc.nextDouble();
        System.out.println("Вы введи число: " + doubleNumber);

        sc.close();

    }
}
