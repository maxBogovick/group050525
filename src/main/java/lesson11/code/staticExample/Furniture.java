package lesson11.code.staticExample;

public class Furniture {
    public static void main(String[] args) {

        Chair chair1 = new Chair(1, "m1");
        Chair chair2 = new Chair(2, "m2");
        Chair chair3 = new Chair(3, "m1");

        System.out.println(Chair.chairCounter);
    }
}
