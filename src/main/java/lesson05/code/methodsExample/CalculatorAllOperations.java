package lesson05.code.methodsExample;

public class CalculatorAllOperations {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.x = 10;
        calculator.y = 2;

        calculator.sum();
        System.out.println("Результат сложения: " + calculator.result);

        calculator.sub();
        System.out.println("Результат вычитания: " + calculator.result);

        calculator.multi();
        System.out.println("Результат умножения: " + calculator.result);

        calculator.divide();
        System.out.println("Результат деления: " + calculator.result);

    }
}
