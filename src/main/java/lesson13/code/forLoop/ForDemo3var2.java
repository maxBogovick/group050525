package lesson13.code.forLoop;

public class ForDemo3var2 {
    public static void main(String[] args) {
        /*

        просуммировать все четные числа в диапазоне от 20 до 30
         */

        int evenSum = 0;

        for (int i = 20; i <= 30; i = i + 2) {
                evenSum = evenSum + i;
        }

        System.out.println("Сумма всех четных чисел от 20 до 30 = " + evenSum);


    }
}
