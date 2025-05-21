package lesson11.code.operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // операторы сравнения

        int x = 10;
        int y = 15;

        // мы утверждаем что левая часть (x) равна (эквивалентна) правой части (y)
        // и результат это утверждения: true или false мы сохраняем в boolean resultEqual
        boolean resultEqual = (x == y);
        System.out.println(resultEqual);

        boolean resultNotEqual = (x != y);
        System.out.println(resultNotEqual);

        boolean resultGreater = (x > y);
        System.out.println(resultGreater);

        boolean resultGreaterOrEqual = (x >= y);
        System.out.println(resultGreaterOrEqual);

        boolean resultLess = (x < y);
        System.out.println(resultLess);

        boolean resultLessOrEqual = (x <= y);
        System.out.println(resultLessOrEqual);


    }
}
