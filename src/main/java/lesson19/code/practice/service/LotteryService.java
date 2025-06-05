package lesson19.code.practice.service;

import lesson19.code.practice.LotteryConfiguration;
import lesson19.code.practice.entity.Player;
import lesson19.code.practice.entity.Ticket;
import lesson19.code.practice.repository.LotteryRepository;
import lesson19.code.practice.repository.PlayerRepository;
import lesson19.code.practice.repository.TicketRepository;

public class LotteryService {
    private PlayerRepository playerRepository = new PlayerRepository();
    private TicketRepository ticketRepository = new TicketRepository();
    private LotteryRepository lotteryRepository = new LotteryRepository();


    public boolean registerPlayer(String name) {


        // могли бы провести проверку соответствия имени неким критериям
        // например: имя не пустое, имя содержит запрещенные символы

        Player player = new Player(name);
        boolean isSaved = playerRepository.save(player);
        return isSaved;
    }

    public void prepareLottery() {
        lotteryRepository.makeLottery();
    }

    public void generateTicketsWithoutPlayers(){
        for (int i = 0; i < LotteryConfiguration.MAX_TICKETS; i++) {
            Ticket ticket = new Ticket();
            ticketRepository.saveTicket(ticket);
        }
    }

    public void printResults(){
        // добавить вывод информации о результатах
        // продумать - это нужно делать здесь или где-то еще???

    }

}
