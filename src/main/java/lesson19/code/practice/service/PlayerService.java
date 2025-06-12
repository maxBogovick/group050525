package lesson19.code.practice.service;

import lesson19.code.practice.entity.Player;
import lesson19.code.practice.repository.PlayerRepository;

public class PlayerService {
    private PlayerRepository playerRepository = new PlayerRepository();

    public boolean registerPlayer(String name) {

        // могли бы провести проверку соответствия имени неким критериям
        // например: имя не пустое, имя содержит запрещенные символы

        Player player = new Player(name);
        boolean isSaved = playerRepository.save(player);
        return isSaved;
    }

}
