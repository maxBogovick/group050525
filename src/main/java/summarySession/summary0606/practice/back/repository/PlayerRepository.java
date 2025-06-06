package summarySession.summary0606.practice.back.repository;

import summarySession.summary0606.practice.LotteryConfiguration;
import summarySession.summary0606.practice.back.entity.Player;

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

    public boolean save(Player player){
        if (playersCounter < players.length) {
            players[playersCounter++] = player;
            return true;
        }
        return false;
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
