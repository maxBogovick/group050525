package lesson05.code;

public class PrimitiveAndReferenceTypeDifference {
    public static void main(String[] args) {

        // объявляя переменную подобным образом (без присвоения значения)
        // мы ее только декларируем, но не инициализируем - то есть не можем с ней
        // совершать какие-то действия (например, распечатать)
        int x;

        // System.out.println(x); - при попытке распечатать значение из не инициализированной переменной
        // компилятор выдаст ошибку


        int y = 10;

        System.out.println(y);


        // создадим экземпляр класса Point

        Point myPoint = new Point();

        System.out.println(myPoint.x);
        /*
        в момент создания экземпляра класса JVM создавая переменные внутри это экземпляра класса
        обязана заполнить их "значениями по умолчанию"

        Это значения:
        - для чисел : 0 или 0.0
        - для boolean : false
        - для ссылочной переменной : null - или пустая ссылка (не существующая ссылка)

        null - сокращение от null pointer
         */

        Book book1 = new Book();

        System.out.println(book1.bookIndex);
        System.out.println(book1.bookTitle);
        System.out.println(book1.bookAuthor);

        book1.bookIndex = 1;
        book1.bookTitle = "Три мушкетера";
        book1.bookAuthor = "Дюма";

        System.out.println("Заполним значения полей: ");
        System.out.println(book1.bookIndex);
        System.out.println(book1.bookTitle);
        System.out.println(book1.bookAuthor);

        // пример ошибки при работе с null
        // она возникает когда мы пытаемся совершить какие-то действия или операции
        // со значением из переменной в которой пока что хранится null
        // например узнать длину строки (сколько в ней символов) из переменной secondBook.bookTitle

        Book secondBook = new Book();

        System.out.println(secondBook.bookTitle.length());
    }
}
