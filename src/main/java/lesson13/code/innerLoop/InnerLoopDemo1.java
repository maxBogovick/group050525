package lesson13.code.innerLoop;

public class InnerLoopDemo1 {
    public static void main(String[] args) {
        /*
        пример вложенного цикла
         */

        for (int i = 1; i <= 3; i++) {
            System.out.println("Значение индекса i = " + i);
            // внутри цикла могут находится ЛЮБЫЕ операторы,
            // в том числе - другие циклы
            for (int j = 1; j <= 5; j++) {
                System.out.println("     Индекс второго цикла j = " + j);
            }

            System.out.println("-----------");
        }
    }
}
