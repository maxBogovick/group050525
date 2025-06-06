package summarySession.summary0606.practice.back.service;

import summarySession.summary0606.practice.back.entity.Player;
import summarySession.summary0606.practice.back.repository.PlayerRepository;

public class PlayerService {
    private PlayerRepository playerRepository;
    private TicketService ticketService;

    public PlayerService(PlayerRepository playerRepository, TicketService ticketService) {
        this.playerRepository = playerRepository;
        this.ticketService = ticketService;
    }

    public Player registerPlayer(String name) {

        // могли бы провести проверку соответствия имени неким критериям
        // например: имя не пустое, имя содержит запрещенные символы

        Player player = new Player(name);
        boolean isSaved = playerRepository.save(player);

        if (isSaved) {
            return player;
        } else {
            return null;
        }
    }

    public boolean sellTicketsToPlayer(Player player, int quantityTicketsToSell) {
        /*
        - регистрируем пользователя
        - спрашиваем его - сколько билетов он хочет купить
        - в каждом билете от номера ... до номера .. (общее количество билетов будет таким - сколько мы продали игроку)
         в поле playerId сохранить значение текущего игрока и изменить значение переменной ticketsSellingCounter
         отразив в ней ОБЩЕЕ количество проданных билетов
         мы это делаем в TicketRepository так как там хранится массив с билетами
         НО мы не имеем ту да прямого доступа

         ДЛЯ РАБОТЫ С TicketRepository МЫ НЕ ИМЕЕМ ПРАВО организовывать к нему доступ из PlayerService
         если нам надо обратится к TicketRepository то мы должны и будем это делать используя TicketService

         */

        boolean sellResult = ticketService.sellTicketToPlayer(player.getId(), quantityTicketsToSell);
        return sellResult;
    }

}
