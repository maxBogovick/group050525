package summarySession.summary0606.practice.back.service;


import summarySession.summary0606.practice.LotteryConfiguration;
import summarySession.summary0606.practice.back.entity.Ticket;
import summarySession.summary0606.practice.back.repository.TicketRepository;

import java.util.Arrays;

public class TicketService {

    private TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public void generateTicketsWithoutPlayers(){
        for (int i = 0; i < LotteryConfiguration.MAX_TICKETS; i++) {
            Ticket ticket = new Ticket();
            ticketRepository.saveTicket(ticket);
        }
    }

    public boolean sellTicketToPlayer(int playerId, int quantityTicketsToSell) {
        boolean sellingResult = ticketRepository.sellTicket(playerId, quantityTicketsToSell);
        return sellingResult;
    }

    public int[] returnWinnerTicketsId(int[] winnerNumbers){
        return ticketRepository.allWinnerTickets(winnerNumbers);
    }

    public void printWinnerTickets(int[] winnerTicketsId){


        for (int i = 0; i < winnerTicketsId.length; i++) {
            int currentTicketId = winnerTicketsId[i];
            Ticket currentTicket = ticketRepository.getTicketById(currentTicketId-1);

            System.out.println(currentTicket);
            //System.out.println("Билет № " + currentTicket + ", номера билета: " + Arrays.toString(currentTicket.getNumbers()) + ", id игрока: " + currentTicket.getPlayerId());
        }
    }
}
