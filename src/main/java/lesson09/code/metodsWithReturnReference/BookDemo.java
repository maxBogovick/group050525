package lesson09.code.metodsWithReturnReference;

public class BookDemo {
    public static void main(String[] args) {

        BookService bookService = new BookService();

        Book myBook1 = bookService.createBook();

        System.out.println(myBook1);

        Book myBook2 = bookService.createBook();

        System.out.println(myBook2);

        Book myBook3 = bookService.createBook();

        System.out.println(myBook3);
    }
}
