package lesson19.code.practice.repository;

import lesson19.code.practice.LotteryConfiguration;
import lesson19.code.practice.entity.Ticket;

public class TicketRepository {

    private Ticket[] tickets;
    private int ticketCounter;

    public TicketRepository() {
        this.tickets = new Ticket[LotteryConfiguration.MAX_TICKETS];
        this.ticketCounter = 0;
    }

    public boolean saveTicket(Ticket ticket){
        if (ticketCounter < tickets.length) {
            tickets[ticketCounter++] = ticket;
            return true;
        }
        return false;
    }

    public Ticket[] findTicketsByPlayerId(int playerId){
        int playerTicketsCounter = 0;

        for (int i = 0; i < ticketCounter; i++) {
            if (tickets[i].getPlayerId() == playerId){
                playerTicketsCounter++;
            }
        }

        if (playerTicketsCounter > 0) {
            Ticket[] playerTickets = new Ticket[playerTicketsCounter];
            int playerTicketsIndex = 0;// переменная для индекса массива билетов игрока

            // проходимся по всем билетам и смотрим его playerId
            // если он совпадает с тем который мы ищем, то добавляем его в массив playerTickets
            for (int i = 0; i < ticketCounter; i++) {
                if (tickets[i].getPlayerId() == playerId){
                    playerTickets[playerTicketsIndex++] = tickets[i];
                }
            }

            return playerTickets;
        } else {
            return null;
        }
    }
}
