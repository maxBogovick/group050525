package lesson18.code.recursion;

public class Factorial {

    int getFactorial(int n){
        if (n == 0) return 1;
        return n * getFactorial(n - 1);
        /*
        n = 3

        1 -> getFactorial(3)
          наша функция должна вернуть результат умножения числа 3 на результат getFactorial(2)

        2 -> getFactorial(2)
         n не равна 0, поэтому результат должен быть равен 2 * getFactorial(1)

        3 ->  getFactorial(1)
        n не равна 0, поэтому результат должен быть равен 1 * getFactorial(0)

        4 -> getFactorial(0)
        n == 0 -> поэтому сразу возвращаем 1

        Общий результат будет равен: 3 * 2 * 1 * 1

         */
    }
}
