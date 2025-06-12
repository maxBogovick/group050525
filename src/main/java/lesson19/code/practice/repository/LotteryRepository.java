package lesson19.code.practice.repository;

import lesson19.code.practice.LotteryConfiguration;

import java.util.Random;

public class LotteryRepository {

    private int[] allNumbers;
    private int[] shuffledNumbers;
    private int[] winningNumbers;

    public LotteryRepository() {
        this.allNumbers = new int[LotteryConfiguration.LOTTERY_SIZE];
        this.winningNumbers = new int[LotteryConfiguration.TICKET_SIZE];
    }

    public int[] getWinningNumbers() {
        return winningNumbers.clone();
    }

    public void makeLottery(){
        generateAllNumbers();
        shuffleNumbers();
        selectWinningNumbers();
    }

    private void generateAllNumbers(){
        for (int i = 0; i < allNumbers.length ; i++) {
            allNumbers[i] = i + 1;
        }
    }

    private void shuffleNumbers(){
        shuffledNumbers = allNumbers.clone();
        Random random = new Random();

        for (int i = shuffledNumbers.length - 1; i > 0  ; i--) {
            int indexElementForChange = random.nextInt(i);
            int temp = shuffledNumbers[i];
            shuffledNumbers[i] = shuffledNumbers[indexElementForChange];
            shuffledNumbers[indexElementForChange] = temp;
        }
    }

    private void selectWinningNumbers() {
        for (int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = shuffledNumbers[i];
        }
    }
}
