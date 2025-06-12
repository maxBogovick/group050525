package lesson19.code.practice.service;


import lesson19.code.practice.LotteryConfiguration;
import lesson19.code.practice.entity.Ticket;
import lesson19.code.practice.repository.LotteryRepository;
import lesson19.code.practice.repository.TicketRepository;

public class TicketService {

    private TicketRepository ticketRepository = new TicketRepository();

    public void generateTicketsWithoutPlayers(){
        for (int i = 0; i < LotteryConfiguration.MAX_TICKETS; i++) {
            Ticket ticket = new Ticket();
            ticketRepository.saveTicket(ticket);
        }
    }

}
