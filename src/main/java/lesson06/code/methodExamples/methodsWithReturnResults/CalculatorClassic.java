package lesson06.code.methodExamples.methodsWithReturnResults;

public class CalculatorClassic {

    public double sum(double x, double y) {
        double result = x + y;
        return result;
    }

    public void printInfo(String typeOfOperation, double result){
        System.out.println("Результат операции " + typeOfOperation + " равен : " + result);
    }
}
