package lesson19.code.practice.entity;

import lesson19.code.practice.LotteryConfiguration;
import lesson19.code.practice.service.NumberGenerator;

public class Ticket {
    private static int nextTicketId = 1;
    private int ticketId;
    private int[] numbers;
    private int playerId;
    private int lotteryDiapazon;

    public Ticket() {
        this.ticketId = nextTicketId++;
        this.numbers = new int[LotteryConfiguration.TICKET_SIZE];
        this.lotteryDiapazon = LotteryConfiguration.LOTTERY_SIZE;
        generateTicketNumbers();
    }

    public void sellTicketPlayer(int playerId){
        this.playerId = playerId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public int[] getNumbers() {
        return numbers.clone();
    }

    // необходимо создать метод для заполнения массива чисел этого билета
    // либо каким-то образом в него передать эти данные

    private void generateTicketNumbers(){
        int[] generated = NumberGenerator.generateRandomUniqueNumbers(lotteryDiapazon, numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generated[i];
        }
    }


}
