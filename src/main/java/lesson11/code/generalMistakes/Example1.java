package lesson11.code.generalMistakes;

public class Example1 {
    public static void main(String[] args) {

        // неправильный порядок условий при проверке

        int score = 85;

        if (score >= 60){
            System.out.println("удовлетворительно");
        } else if (score >= 80) {
            System.out.println("хорошо");
        }

        // перекрытие диапазонов

        int age = 17;

        if (age <= 21) {
            System.out.println("Все еще сигареты не продаем");
        } else if (age < 18) {
            System.out.println("меньше чем 18");
        }

        // отсутствие else там где он необходим

        int number = 7;

        if (number % 2 == 0) {
            System.out.println("Четное");
        }

        System.out.println("Нечетное");
    }
}
