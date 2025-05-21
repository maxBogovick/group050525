package lesson11.code.ifStatement;

public class IfStatementExample {
    public static void main(String[] args) {
        // для ввода данных используем класс UserInputStatic

        int userData = UserInputStatic.inputInt("Please enter integer number: ");

        if (userData < 0) {
            System.out.println("Вы ввели отрицательное число!");
        } else if (userData >= 0 && userData < 100) {
            System.out.println("Вы ввели положительное число в диапазоне от 0 до 100");
        } else {
            System.out.println("Вы ввели число более или равно 100");
        }

    }
}
