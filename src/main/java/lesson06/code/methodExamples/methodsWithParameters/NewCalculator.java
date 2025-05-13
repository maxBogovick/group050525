package lesson06.code.methodExamples.methodsWithParameters;

public class NewCalculator {

    double result;

    public void sum(double x, double y){
        result = x + y;
    }


    public void printResult(){
        System.out.println("Содержимое переменной result = " + result);
    }

    public void sub(double x, double y){
        result = x - y;
    }

    public void multi(double x, double y){
        result = x * y;
    }


}
