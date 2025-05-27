package lesson14.code.task4;

import lesson11.code.ifStatement.UserInputStatic;

public class Task4 {
    public static void main(String[] args) {

        // *) Проверить является ли число которое ввел пользователь - простым
        // (Простое число - число,
        // которое делится без остатка только на 1 и на себя)

        int userNumber = UserInputStatic.inputInt("Введите число для проверки: ");

        // исходим из того, что введенной число больше 1

        boolean isSimple = true;

        for (int i = 2; i < userNumber; i++) {
            if (userNumber % i == 0) {
                System.out.println("Остаток при делении числа " + userNumber + " на " + i + " равен 0");
                isSimple = false;
                break;
            }
        }

        if (isSimple) {
            System.out.println("Число " + userNumber + " является простым");
        } else {
            System.out.println("Число " + userNumber + " не является простым");
        }


    }
}
