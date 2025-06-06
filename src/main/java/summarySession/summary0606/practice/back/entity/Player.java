package summarySession.summary0606.practice.back.entity;

public class Player {

    private static int nextId = 1; // поле для хранения информации о том сколько всего игроков есть
    private int id; // идентификатор игрока
    private String name;

    public Player(String name) {
        this.id = nextId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
