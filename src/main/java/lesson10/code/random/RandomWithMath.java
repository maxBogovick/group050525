package lesson10.code.random;

public class RandomWithMath {

    public static void main(String[] args) {

        /*
        Math.random() - возвращает значение типа double в диапазоне от 0.0 до 1.0 (не включая)

        Вопрос: а как нем получить значение псевдослучайного числа в диапазоне от
        числа number1 до number2 ?

        number1 = 100
        number2 = 500

        если Math.random() возвращает значение от 0 до 1

        то есть 0 -> 100
        а 1 -> 500

        number1 + random() * (number2 - number1)

        random() = 0 -> 100 + 0 * (500 - 100) = 100 + 0 = 100

        random() = 1 -> 100 + 1 * (500 - 100) = 100 + 1 * 400 = 500

        random() = 0.5 -> 100 + 0.5 * (500 - 100) = 100 + 200 = 300

         */

        double random1 = Math.random();

        double random2 = 100 + Math.random() * ( 500 - 100);


        System.out.println(random1);
        System.out.println(random2);


        double random3 = 0 + Math.random() * ( 100 - 0);
        double random4 = 120 + Math.random() * ( 150 - 120);
        double random5 = 150_000 + Math.random() * ( 1_000_000 - 150_000);

        System.out.println(random3);
        System.out.println(random4);
        System.out.println(random5);

        /*

        Если нам необходимо округлить значение до целого

        Существуют три метода для округления:

        Math.round() - стандартное округление по принципам математики (0.49 -> 0; 0.51 -> 1)

        Math.floor() - округление до ближайшего целого вниз - по сути отбрасывается после запятой 2,9 -> 2

        Math.cell() - округление до ближайшего целого вверх - вне зависимости от того, что после запятой 2,1 -> 3


        Если мы хотим оставить определенное количество цифр после запятой



         */

        double myDouble = 3.1415497; // как получить 3.14

        double myDouble2Digit = Math.round(myDouble * 10000) / 100.0;


        System.out.println(myDouble2Digit);



    }
}
