package lesson09.code.bookWithAuthor;

public class BookDemo {

    public static void main(String[] args) {

        Author author1 = new Author("Дюма","француз");

        Book book1 = new Book("Три мушкетера", author1);

        System.out.println(author1);

        System.out.println(book1);

        // ------- предположим что у нас есть ссылка на book ----

        // Author bookAuthor = book1.getAuthor();


        System.out.println("Имя автора книги: " + book1.getAuthor().getAuthorName());

    }
}
