package lesson17.code.algoritm;

import lesson11.code.ifStatement.UserInputStatic;

import java.util.Random;

public class AlgorithmDemo {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[100];

        // заполним массив числами

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();

            // выведем на консоль

            System.out.println(numbers[i]);
        }

        // - линейная сложность (надо выполнить N действий,
        // где N - количество элементов в массиве)

        // запросим у пользователя номер элемента массива из которого надо взять данные

        int userElementNumber = UserInputStatic.inputInt("Введите номер элемента: ");

        System.out.println(numbers[userElementNumber]);

        // алгоритм получения данных из нужной нам ячейки массива - постоянная сложность



    }
}
