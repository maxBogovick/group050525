package lesson14.code.task5;

import lesson11.code.ifStatement.UserInputStatic;

public class Task5 {
    public static void main(String[] args) {

        // Запросите у пользователя число N и выведите ВСЕ простые числа от 1 до N

        int userNumber = UserInputStatic.inputInt("Введите число : ");

        for (int currentNumber = 2; currentNumber < userNumber; currentNumber++) {
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
