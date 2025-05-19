package lesson09.code.bookWithAuthor;

public class BookDemo {

    public static void main(String[] args) {

        Author author1 = new Author("Дюма","француз");

        Book book1 = new Book("Три мушкетера", author1);

        System.out.println(author1);

        System.out.println(book1);
    }
}
