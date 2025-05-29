package lesson13.code.doWhileLoop;

import lesson11.code.ifStatement.UserInputStatic;

public class DoWhileDemo {
    public static void main(String[] args) {

        System.out.println("Введите текст или enter для выхода:");
        String usertext = "";
        do {
            usertext = UserInputStatic.inputText("");
            System.out.println("Ваш текст: " + usertext);
        } while (!usertext.isEmpty());

    }
}
