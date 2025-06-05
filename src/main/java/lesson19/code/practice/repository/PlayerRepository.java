package lesson19.code.practice.repository;

import lesson19.code.practice.LotteryConfiguration;
import lesson19.code.practice.entity.Player;

public class PlayerRepository {
    // CRUD - create, read, update, delete

    private Player[] players;
    private int playersCounter;

    public PlayerRepository() {
        this.players = new Player[LotteryConfiguration.MAX_PLAYERS];
        this.playersCounter = 0;
    }

    public int getPlayersCounter() {
        return playersCounter;
    }

    public Player save(String name){
        if (playersCounter < players.length) {
            Player player = new Player(name);
            players[playersCounter++] = player;
            return player;
        }

        return null;
    }

    public Player findById(int idForSearch){
        for (int i = 0; i < playersCounter; i++) {
            if (players[i].getId() == idForSearch) {
                return players[i];
            }
        }
        return null;
    }

}
