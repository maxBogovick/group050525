package lesson13.code.innerLoop;

public class InnerLoopDemo2 {
    public static void main(String[] args) {
        /*
        построение таблицы умножения
         */

        for (int i = 1; i <= 5; i++) {// индекс i - номер строки

            for (int j = 1; j <= 3; j++) { // индекс j - номер столбца
                System.out.print("  " + i * j);
            }

            System.out.println();
        }
    }
}
