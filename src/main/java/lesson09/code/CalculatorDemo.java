package lesson09.code;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double sumResult = calculator.sum(12,25);

        System.out.println("Сумма равна: " + sumResult);
    }
}
