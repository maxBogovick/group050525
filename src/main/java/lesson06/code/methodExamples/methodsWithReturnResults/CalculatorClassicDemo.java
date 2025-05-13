package lesson06.code.methodExamples.methodsWithReturnResults;

public class CalculatorClassicDemo {
    public static void main(String[] args) {

        CalculatorClassic calculator = new CalculatorClassic();


        double sumResult = calculator.sum(12,7);

        //System.out.println("Результат суммы = " + sumResult);

        calculator.printInfo("сложения",sumResult);


    }
}
