package lesson18.code.practice;

import java.util.Arrays;
import java.util.Random;

public class Lottery {

    private int[] allLotteryNumbers;
    private int[] winnerNumbers;

    public int[] getAllLotteryNumbers() {
        return allLotteryNumbers;
    }

    public int[] getWinnerNumbers() {
        return winnerNumbers;
    }

    // создание массива ВСЕЗ номеров на основании количества, которое нам дали
    public void createLotteryNumbers(int lotterySize){
        allLotteryNumbers = new int[lotterySize];
        for (int i = 0; i < allLotteryNumbers.length; i++) {
            allLotteryNumbers[i] = (i + 1);
        }
    }


    // метод для перемешивания массива номеров
    public void shuffleNumbers(){
        Random random = new Random();
        for (int i = allLotteryNumbers.length - 1; i > 0 ; i--) {
            int index = random.nextInt(i);
            // change elements
            int temp = allLotteryNumbers[index];
            allLotteryNumbers[index] = allLotteryNumbers[i];
            allLotteryNumbers[i] = temp;

            /*
            length = 36
            i = 35
            index = в диапазоне от 0 до 34 (включительно), например 18
            меняем элементы 35 (значение в переменной i) с элементом с индексом из переменной index (например 18)

            i = 34
            index = в диапазоне от 0 до 33 (включительно), например 5
            меняем элементы 34 (значение в переменной i) с элементом с индексом из переменной index (например 5)

            ...

            i = 1
            index = в диапазоне от 0 до 0 (включительно), например 0
            меняем элементы 1 (значение в переменной i) с элементом с индексом из переменной index (например 0)


             */
        }
    }

    // метод для получения выигрышных номеров
    // создаем массив для выигрышных номеров той длины, сколько номеров должно быть
    // перемешиваем все номера
    // берем попорядку начиная с первого столько - сколько должно быть выигрышных номеров

    public void lotteryRound(int quantityWinnerNumbers){
        winnerNumbers = new int[quantityWinnerNumbers];
        shuffleNumbers(); // перемешать номера
        for (int i = 0; i < winnerNumbers.length; i++) {
            winnerNumbers[i] = allLotteryNumbers[i];
        }
        Arrays.sort(winnerNumbers);
    }

    public void printWinnerNumbers(){
        System.out.println("Выигрышные номера: " + Arrays.toString(winnerNumbers));
    }
}
