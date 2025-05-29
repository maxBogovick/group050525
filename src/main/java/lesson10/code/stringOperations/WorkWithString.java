package lesson10.code.stringOperations;

public class WorkWithString {
    public static void main(String[] args) {

        String str1 = "  ";
        String str2 = "";
        String text = "Это текст для проверки работы методов класса String";


        int meTextLength = text.length();

        System.out.println("======= вычисление длины строки =====");
        System.out.println(meTextLength);


        System.out.println("=== проверка строки на наличие ЛЮБЫХ символов ===");
        boolean isMyStr1Empty = str1.isEmpty();
        System.out.println(isMyStr1Empty);

        boolean isMyStr2Empty = str2.isEmpty();
        System.out.println(isMyStr2Empty);

        System.out.println("=== проверка строки на наличие ЛЮБЫХ символов кроме пробела ===");
        boolean isMyStr1Blank = str1.isBlank();
        System.out.println(isMyStr1Blank);

        boolean isMyStr2Blank = str2.isBlank();
        System.out.println(isMyStr2Blank);





    }
}
