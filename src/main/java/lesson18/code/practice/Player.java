package lesson18.code.practice;

import java.util.Arrays;

public class Player {

    private String idCode;

    private int numberTickets;

    private LotteryTicket[] tickets;

    public Player(String idCode, int numberTickets) {
        this.idCode = idCode;
        this.numberTickets = numberTickets;
        tickets = new LotteryTicket[numberTickets];
    }

    public String getIdCode() {
        return idCode;
    }

    public int getNumberTickets() {
        return numberTickets;
    }

    public LotteryTicket[] getTickets() {
        return tickets;
    }

    public void fillTickets(int sizeTicket, int sizeLotteryNumbers, boolean isRandom){
        for (int i = 0; i < tickets.length; i++) {
            // создаем билет
            tickets[i] = new LotteryTicket();
            tickets[i].createAndFillTicket(sizeTicket,sizeLotteryNumbers,isRandom, i);
        }
    }

    public void printPlayerData(){
        System.out.println("Player ID: " + idCode);
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Билет № " + i);
            System.out.println(Arrays.toString(tickets[i].getTicketNumbers()));
        }
    }
}
