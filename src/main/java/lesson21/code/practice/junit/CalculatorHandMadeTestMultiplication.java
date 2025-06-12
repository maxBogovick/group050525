package lesson21.code.practice.junit;

public class CalculatorHandMadeTestMultiplication {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // исходные данные
        int x = 5;
        int y = -5;

        // ожидаемый результат
        int expectedResult = -25;

        // реальный результат (результат работы метода)

        int actualResult = calculator.multiplication(x,y);

        // ----------- test (compare result) ---------

        if (actualResult == expectedResult){
            System.out.println("Test OK!");
        } else {
            System.out.println("TEST FAILED!!!");
            System.out.println("Expected: " + expectedResult + ", but received :" + actualResult);
        }
    }
}
