package lesson19.code.practice.service;

import java.util.Arrays;
import java.util.Random;

public class NumberGenerator {


    public static int[] generateRandomUniqueNumbers(int lotteryDiapazon, int length) {
        Random random = new Random();

        int[] generated = new int[length];

        for (int i = 0; i < length; i++) {
            // нам необходимо обеспечить такой механизм заполнения, чтобы у нас не было повторяющихся номеров

            boolean isNotFillCurrentNumber = true;

            // до тех пор пока мы считаем, что текущий номер не заполнен делаем следующее:
            while (isNotFillCurrentNumber) {
                // получаем очередное значение для текущего номера билета
                int currentRandomValue = random.nextInt(lotteryDiapazon) + 1;

                // проверяем - а есть ли уже среди ранее введенных номеров такое значение
                // если "да" - то повторно запрашиваем номер
                // если "нет" - то сохраняем полученное значение в текущую ячейку массива и переходим к следующему

                if (isCurrentNumberNotRepeate(currentRandomValue, generated)) {
                    generated[i] = currentRandomValue;
                    isNotFillCurrentNumber = false;
                }
            }
        }
        // отсортируем массив значений по возрастанию
        Arrays.sort(generated);
        return generated;

    }

    private static boolean isCurrentNumberNotRepeate(int checkNumber, int[] generated) {
        for (int i = 0; i < generated.length; i++) {
            if (generated[i] == checkNumber) {
                return false;
            }
        }
        return true;
    }
}
