package lesson12.code.practice;

public class CompareString {
    public static void main(String[] args) {


        String text1 = "My text";
        String text2 = "My text";
        String text3 = new String("My text");

        System.out.println(text1 == text2);
        System.out.println(text1 == text3);

        System.out.println(text1.equals(text2));
        System.out.println(text1.equals(text3));


    }
}
