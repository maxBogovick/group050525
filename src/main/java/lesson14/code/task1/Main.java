package lesson14.code.task1;

public class Main {
    public static void main(String[] args) {
        /*
        вывести в цикле все числа от 1 до 5

        - цикл while
        - цикл do-while
         */

        // вариант 1
        System.out.println("----- вариант 1 -------");
        int counter = 1;

        while (counter <= 5) {
            System.out.println(counter);
            counter++;
        }

        // вариант 2

        System.out.println("----- вариант 1 -------");

        counter = 0;

        while (counter < 5) {
            System.out.println(counter + 1);
            counter++;
        }

        // вариант 3

        System.out.println("----- вариант 3 -------");

        counter = 0;

        while (counter < 5) {
            System.out.println(++counter);
        }

        // вариант 4

        System.out.println("----- вариант 4  -------");

        counter = 1;

        do{
            System.out.println(counter++);
        } while (counter <= 5);


    }
}
