package lesson05.code.string;

public class StringExample {
    public static void main(String[] args) {

        String text = new String("Пример текста.");

        System.out.println(text);


        // разработчики Java создали специальный механизм, чтобы сразу в момент объявления
        // переменной типа String туда можно было положить значение не используя оператор new

        String name = "Ruslan";

        // был "изменена" логика работы оператора '+', так чтобы сроки модно было соединять

        String fullText = "Начало строки текста" + " и продолжение строки";

        System.out.println(name);

        System.out.println(fullText);

    }
}
