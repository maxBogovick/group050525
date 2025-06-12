package summarySession.summary0606.practice;

import summarySession.summary0606.practice.back.repository.LotteryRepository;
import summarySession.summary0606.practice.back.repository.PlayerRepository;
import summarySession.summary0606.practice.back.repository.TicketRepository;
import summarySession.summary0606.practice.back.service.LotteryService;
import summarySession.summary0606.practice.back.service.PlayerService;
import summarySession.summary0606.practice.back.service.TicketService;
import summarySession.summary0606.practice.front.UserInterface;

public class LotteryApp {
    public static void main(String[] args) {

        TicketRepository ticketRepository = new TicketRepository();
        PlayerRepository playerRepository = new PlayerRepository();
        LotteryRepository lotteryRepository = new LotteryRepository();

        TicketService ticketService = new TicketService(ticketRepository);
        LotteryService lotteryService = new LotteryService(lotteryRepository);
        PlayerService playerService = new PlayerService(playerRepository, ticketService);

        UserInterface userInterface = new UserInterface(lotteryService,playerService,ticketService);

        userInterface.menu();

    }
}
