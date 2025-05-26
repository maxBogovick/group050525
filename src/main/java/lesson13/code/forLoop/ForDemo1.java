package lesson13.code.forLoop;

public class ForDemo1 {
    public static void main(String[] args) {
        /*
        просуммируйте все числа от 0 до 10
         */

        int finalSum = 0;

        for (int i = 0; i <= 10; i++) {
            finalSum = finalSum + i;
        }

        System.out.println("Сумма чисел от 0 до 10 = " + finalSum);

    }
}
