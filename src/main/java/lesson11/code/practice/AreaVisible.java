package lesson11.code.practice;

public class AreaVisible {
    public static void main(String[] args) {

        String textResult = "";
        int x = 11;

        if (x % 2 == 0) {
            textResult = "четное";
        } else {
            textResult = "не четное";
        }

        System.out.println("Число " + x + " - " + textResult);
    }
}
