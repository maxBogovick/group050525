package lesson11.code.staticExample;

public class Chair {

    static int chairCounter = 0;

    int id;

    String model;

    public Chair(int id, String model) {
        this.id = id;
        this.model = model;
        chairCounter= chairCounter + 1;
        // сокращенная форма записи выглядит так: chairCounter++;
    }
}
