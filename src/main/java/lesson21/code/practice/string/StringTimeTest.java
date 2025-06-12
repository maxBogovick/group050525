package lesson21.code.practice.string;

public class StringTimeTest {
    public static void main(String[] args) {
        String str = "";

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            str = str + i;
            //System.out.println(str);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Время на проведение операции: " + (endTime - startTime));
    }
}
