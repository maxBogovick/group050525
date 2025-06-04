package lesson18.code.practice;

import lesson11.code.ifStatement.UserInputStatic;

public class PlayLottery {
    public static void main(String[] args) {

        // создаем константы для нашей лотереи:
        //- количество выигрышных номеров (размер билета)
        //- размер лотереи

        int lotterySize = 36;
        int winnerSize = 5;


        // создаем игрока с определенным количеством билетов

        int quantityPlayerTickets = UserInputStatic.inputInt("Сколько билетов вы хотите купить: ");

        Player player = new Player("123-456-789",quantityPlayerTickets);

        // в игроке мы создаем билеты (а в каждом билете заполняем данные о его номерах)
        boolean isRandom = UserInputStatic.inputBoolean("Вы хотите купить билеты с готовыми числами? (true / false)");

        player.fillTickets(winnerSize,lotterySize,isRandom);

        player.printPlayerData();
    }
}
