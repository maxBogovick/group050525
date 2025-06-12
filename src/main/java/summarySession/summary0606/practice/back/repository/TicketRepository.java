package summarySession.summary0606.practice.back.repository;

import summarySession.summary0606.practice.LotteryConfiguration;
import summarySession.summary0606.practice.back.entity.Ticket;

import java.util.Arrays;

public class TicketRepository {

    private Ticket[] tickets;
    private int ticketCounter;
    private int ticketsSellingCounter;

    public TicketRepository() {
        this.tickets = new Ticket[LotteryConfiguration.MAX_TICKETS];
        this.ticketCounter = 0;
        this.ticketsSellingCounter = 0;
    }

    public boolean saveTicket(Ticket ticket) {
        if (ticketCounter < tickets.length) {
            tickets[ticketCounter++] = ticket;
            return true;
        }
        return false;
    }

    public Ticket getTicketById(int ticketId){
        return tickets[ticketId];
    }

    public Ticket[] findTicketsByPlayerId(int playerId) {
        int playerTicketsCounter = 0;

        for (int i = 0; i < ticketCounter; i++) {
            if (tickets[i].getPlayerId() == playerId) {
                playerTicketsCounter++;
            }
        }

        if (playerTicketsCounter > 0) {
            Ticket[] playerTickets = new Ticket[playerTicketsCounter];
            int playerTicketsIndex = 0;// переменная для индекса массива билетов игрока

            // проходимся по всем билетам и смотрим его playerId
            // если он совпадает с тем который мы ищем, то добавляем его в массив playerTickets
            for (int i = 0; i < ticketCounter; i++) {
                if (tickets[i].getPlayerId() == playerId) {
                    playerTickets[playerTicketsIndex++] = tickets[i];
                }
            }

            return playerTickets;
        } else {
            return null;
        }
    }


    // метод для продажи очередного одного билета игроку
    public boolean sellTicket(int playerId, int quantityTicketsToSell) {

        if ((ticketsSellingCounter + quantityTicketsToSell) <= tickets.length) {
            // если указатель на последний проданный билет меньше чем общее количество билетов
            // то я имею возможность продать очередной один билет

            for (int i = ticketsSellingCounter; i < (ticketsSellingCounter + quantityTicketsToSell); i++) {
                tickets[i].setPlayerId(playerId);
            }
            ticketsSellingCounter = ticketsSellingCounter + quantityTicketsToSell;
            return true;
        } else {
            return false;
        }
    }


    // создадим метод, который будет возвращать все выигрышные билеты

    public int[] allWinnerTickets(int[] winnerNumbers){
        int[] winnerTickersId = new int[LotteryConfiguration.MAX_TICKETS];
        int winTicketCounter = 0;

        for (int i = 0; i < ticketsSellingCounter; i++) {

            Ticket currentTicket = tickets[i];
            int[] numberFromCurrentTicket = currentTicket.getNumbers();

            if (checkTicketForWin(numberFromCurrentTicket, winnerNumbers)){
                winnerTickersId[winTicketCounter++] = tickets[i].getTicketId();
            }
        }

        int[] result = new int[winTicketCounter];

        for (int i = 0; i < winTicketCounter; i++) {
            result[i] = winnerTickersId[i];
        }

        System.out.println(Arrays.toString(result));
        return result;
    }

    private boolean checkTicketForWin(int[] numbersFromCurrentTicket, int[] winnerNumbers) {

       int matchesCounter = 0;

        for (int i = 0; i < winnerNumbers.length; i++) {

            for (int j = 0; j < numbersFromCurrentTicket.length; j++) {
                if (winnerNumbers[i] == numbersFromCurrentTicket[j])
                {
                    matchesCounter++;
                }
            }
        }

        if (matchesCounter >= LotteryConfiguration.MIN_MATCHES) {
            return true;
        } else {
            return false;
        }


    }


}
