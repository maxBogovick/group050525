package lesson11.code.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // унарный минус

        int x = - 10;

        int y = - x;


        System.out.println(x + " , " + y);

        // инкремент ++

        int z = 100;
        z++; // z = z + 1

        System.out.println(z);

        /*
        существуют два варианта для использования инкремента
        как префикс и как постинкремент

        z++
        ++z

        Отличие заключается в последовательности выполнения действий, в случае, если
        мы используем z++ в качестве аргумента какого-то метода

         */

        int counter = 5;

        System.out.println("counter ++ : " + counter++);

        // сперва печатаем counter с его ТЕКУЩИМ значением, а уже после печати осуществляем
        // увеличение значения на 1

        System.out.println("counter  : " + counter);

        // в случае с ++counter мы СПЕРВА осуществляем операцию инкремент, а уже потом
        // печатаем обновленное значение
        System.out.println("Теперь ++counter: " + ++counter);


        // декремент --


        z--; // z = z - 1

        System.out.println(z);
    }
}
