package lesson12.code.practice.workWithMethod;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumResult = calculator.sum(10,15);

        System.out.println("Сумма 10 + 15 = " + sumResult);

        // имея переменную sumResult и значение в ней мы можем его в дальнейшем использовать
        // для каких-либо действий или вычислений ТОЛЬКО для того чтобы ПОВТОРНО не вызывать
        // метод calculator.sum(10,15)
        // но если нам переменная нужна ТОЛЬКО чтобы напечатать значение

        System.out.println("Сумма 120 + 375 = " + calculator.sum(120,375));

    }
}
