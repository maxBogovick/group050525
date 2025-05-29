package lesson14.code.task5;

import lesson11.code.ifStatement.UserInputStatic;

public class Task5var2 {
    public static void main(String[] args) {

        // Запросите у пользователя диапазон чисел и выведите ВСЕ простые числа в этом диапазоне

        int start = UserInputStatic.inputInt("Введите начало диапазона : ");

        int end = UserInputStatic.inputInt("Введите конец диапазона : ");

        for (int currentNumber = start; currentNumber <= end; currentNumber++) {
           if (isNumberSimple(currentNumber)) {
               System.out.println("Число " + currentNumber + " является простым");
           }
        }

    }

    public static boolean isNumberSimple(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
