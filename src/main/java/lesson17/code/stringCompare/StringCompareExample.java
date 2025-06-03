package lesson17.code.stringCompare;

public class StringCompareExample {
    public static void main(String[] args) {

        char ch1 = 'a';
        char ch2 = 'z';

        System.out.println(ch1 > ch2);

        String str1 = "AAABZ";
        String str2 = "AAACA";

        System.out.println( str1.compareTo(str2));
        // если результат сравнения двух строк будет больше 0
        // то это означает, что str1 > str2 - то есть,
        // если мы бы их "сортировали" то str1 должна быть
        // справа от str2
        // если результат сравнения двух строк будет меньше 0
        // то это означает, что str1 должна быть слева от str2
        // а если результат будет равен 0 - то строки одинаковые
    }
}
