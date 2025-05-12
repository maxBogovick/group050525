package lesson05.code.methodsExample;

public class CalculatorDemo {

    public static void main(String[] args) {


        // создадим экземпляр класса CalculatorSimple

        CalculatorSimple simple = new CalculatorSimple();
        simple.x = 22;
        simple.y = 10;

        simple.result = simple.x / simple.y;

        System.out.println("Результат деления: " + simple.result);



        Calculator calculator = new Calculator();

        calculator.x = 22;
        calculator.y = 10;

        calculator.divide();


        Calculator calculator2 = new Calculator();

        calculator2.x = 55;
        calculator2.y = 5;

        calculator2.divide();
    }
}
