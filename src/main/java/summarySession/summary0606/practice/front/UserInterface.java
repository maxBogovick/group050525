package summarySession.summary0606.practice.front;

import lesson11.code.ifStatement.UserInputStatic;
import summarySession.summary0606.practice.back.entity.Player;
import summarySession.summary0606.practice.back.service.LotteryService;
import summarySession.summary0606.practice.back.service.PlayerService;
import summarySession.summary0606.practice.back.service.TicketService;

public class UserInterface {

    private LotteryService lotteryService;
    private PlayerService playerService;
    private TicketService ticketService;

    public UserInterface(LotteryService lotteryService, PlayerService playerService, TicketService ticketService) {
        this.lotteryService = lotteryService;
        this.playerService = playerService;
        this.ticketService = ticketService;
    }

    public void menu(){
        // создаем все билеты с заполненными номерами в них
        ticketService.generateTicketsWithoutPlayers();

        // необходимо зарегистрировать игрока
        int playerCounter = UserInputStatic.inputInt("Сколько игроков участвует:");

        for (int i = 0; i < playerCounter; i++) {
            String playerName = UserInputStatic.inputText("Введите имя игрока: ");

            Player savedPlayer = playerService.registerPlayer(playerName);

            if (savedPlayer != null) {
                System.out.println("Игрок успешно зарегистрирован");

                int playerTicketQuantity = UserInputStatic.inputInt("Сколько билетов вы хотите купить:");
                playerService.sellTicketsToPlayer(savedPlayer, playerTicketQuantity);

            } else {
                System.out.println("Игрока зарегистрировать не удалось.");
            }

            // после выполнения 19 строки у нас:
            // - в playerRepository в массив игроков сохранятся игроки, которых мы ввели
        }



        lotteryService.prepareLottery();
        // после этого у нас создаются массивы для всех номеров, перемешали все номера и определили выигрышные номера

        printResults();
    }


    private void printResults(){
        // добавить вывод информации о результатах

        // напечатать выигрышные номера

        // ДЛЯ каждого игрока посмотреть каждый его билет
        // если в этом билете количество выигрышных номеров больше или равно нашего критерия (больше
        // или равно нужного числа совпадений) то мы его печатаем

        int[] winnerNumbers = lotteryService.returnWinnerNumbers();

        /*
        в цикле пройтись по каждому билету
        проверить на наличие выигрышных номеров
        если количество выигрышных номеров в билете больше или равно критерию,
        то напечатать этот билет
        из этого взять id игрока к которому этот билет относится
        в списке всех игроков найти этого игрока по его id и напечатать
         */

        int[] winnerTicketsId = ticketService.returnWinnerTicketsId(winnerNumbers);

        for (int i = 0; i < winnerTicketsId.length; i++) {

            System.out.println("Выигрышный билет: " + winnerTicketsId[i]);
        }

    }
}
