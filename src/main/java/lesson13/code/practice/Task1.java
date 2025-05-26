package lesson13.code.practice;

import lesson11.code.ifStatement.UserInputStatic;

public class Task1 {
    public static void main(String[] args) {

        boolean condition = true;

        while (condition) {

            int userNumber = UserInputStatic.inputInt("Введите число: ");

            // проверка: если число отрицательное и нечетное

//            if (userNumber < 0 && userNumber % 2 != 0) {
//                System.out.println("Число отрицательное и нечетное!");
//                condition = false;
//            } else {
//                System.out.println("Вы ввели : " + userNumber);
//            }

            if (userNumber >= 0 || (userNumber < 0 && userNumber % 2 == 0)) {
                System.out.println("Вы ввели : " + userNumber);
            } else {
                System.out.println("Число отрицательное и нечетное!");
                condition = false;
            }
        }


    }
}
