package lesson05.code.methodsExample;

public class Calculator {

    double x;
    double y;
    double result;

    // создадим метод, который будет совершать операцию деления

    public void divide(){
        result = x / y;
    }

    public void sum(){
        result = x + y;
    }

    public void sub(){
        result = x - y;
    }

    public void multi(){
        result = x * y;
    }
}

