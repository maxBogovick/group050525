package lesson13.code.practice;

import lesson11.code.ifStatement.UserInputStatic;

public class DemoWhileAndFor {
    public static void main(String[] args) {
        /*
        дан текст
        необходимо вывести каждую букву этого текста отдельно
         */

        String text = UserInputStatic.inputText("Введите текст: ");

        System.out.println("------- используем цикл FOR ---------");

        for (int indexChar = 0; indexChar < text.length(); indexChar++) {
            char currentChar = text.charAt(indexChar);
            System.out.println("Буква с индексом " + indexChar + " : " + currentChar);
        }

        System.out.println("------- теперь используем цикл WHILE ---------");

        int counter = 0;

        while (counter < text.length()){
            char currentChar = text.charAt(counter);
            System.out.println("Буква с индексом " + counter + " : " + currentChar);
            counter++;
        }

    }
}
