package lesson20.code.practice.taskVar3;

import lesson11.code.ifStatement.UserInputStatic;

public class BookService {


    public boolean addNewBook(Book[] library, int currentQuantity){
        if (currentQuantity < library.length) {

            String bookId = UserInputStatic.inputText("Введите номер каталога книги: ");
            String bookTitle = UserInputStatic.inputText("Введите название книги: ");
            String bookAuthor = UserInputStatic.inputText("Введите автора книги: ");

            Book book = new Book(bookId, bookTitle, bookAuthor);

            library[currentQuantity] = book;
            return true;
        } else {
            return false;
        }
    }


    public void printLibraryInfo(Book[] library, int currentQuantity){
        System.out.println(" -------- полный список книг ------------");

        for (int i = 0; i < currentQuantity; i++) {

            Book currentBook = library[i];
            System.out.print("Номер каталога: " + currentBook.getBookId());
            System.out.print(", Автор книги: " + currentBook.getAuthor());
            System.out.print(", Название книги: " + currentBook.getTitle());
            System.out.println();
        }
    }


    public void findBookByCatalogNumber(Book[] library, int currentQuantity){
        String bookIdSearch = UserInputStatic.inputText("Книгу с каким номером каталога нужно найти:");
        boolean isNotFind = true;

        // ищем по книгам
        for (int i = 0; i < currentQuantity; i++) {
            Book currentBook = library[i];

            if (currentBook.getBookId().equals(bookIdSearch)){
                isNotFind = false;
                System.out.println("Нашли книгу по поиску:");
                System.out.print("Номер каталога: " + currentBook.getBookId());
                System.out.print(", Автор книги: " + currentBook.getAuthor());
                System.out.print(", Название книги: " + currentBook.getTitle());
                System.out.println();
            }
        }

        if (isNotFind) {
            System.out.println("Книги с номером в каталоге: " + bookIdSearch + " не найдено");
        }
    }


    public void findBooksByAuthor(Book[] library, int currentQuantity){
        String bookAuthorSearch = UserInputStatic.inputText("Книги какого автором нужно найти:");
        boolean isNotFind = true;

        // ищем по книгам
        for (int i = 0; i < currentQuantity; i++) {
            Book currentBook = library[i];

            if (currentBook.getAuthor().equals(bookAuthorSearch)){
                isNotFind = false;
                System.out.println("Нашли книгу по поиску:");
                System.out.print("Номер каталога: " + currentBook.getBookId());
                System.out.print(", Автор книги: " + currentBook.getAuthor());
                System.out.print(", Название книги: " + currentBook.getTitle());
                System.out.println();
            }
        }

        if (isNotFind) {
            System.out.println("Книги автора: " + bookAuthorSearch + " не найдены");
        }
    }

    public void findBooksByTitle(Book[] library, int currentQuantity){
        String bookTitleSearch = UserInputStatic.inputText("Книгу с каким названием нужно найти:");
        boolean isNotFind = true;

        // ищем по книгам
        for (int i = 0; i < currentQuantity; i++) {
            Book currentBook = library[i];

            if (currentBook.getTitle().equals(bookTitleSearch)){
                isNotFind = false;
                System.out.println("Нашли книгу по поиску:");
                System.out.print("Номер каталога: " + currentBook.getBookId());
                System.out.print(", Автор книги: " + currentBook.getAuthor());
                System.out.print(", Название книги: " + currentBook.getTitle());
                System.out.println();
            }
        }

        if (isNotFind) {
            System.out.println("Книга с названием: " + bookTitleSearch + " не найдена");
        }
    }
}
