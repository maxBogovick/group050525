package lesson20.code.practice.taskVar1;

import lesson11.code.ifStatement.UserInputStatic;

public class BookDemo {
    public static void main(String[] args) {

        // запросим у пользователя количество книг
        int librarySize = UserInputStatic.inputInt("Сколько книг в библиотеке: ");

        // создадим массив для хранения такого количества экземпляров класса Book,
        // сколько у нас должно быть книг
        Book[] library = new Book[librarySize];


        // в цикле повторим столько раз сколько у нас должно быть книг
        // запросим у пользователя данные для очередной книги, создадим ее
        // и сохраним в массиве на ее порядковом месте

        for (int i = 0; i < library.length; i++) {

            String bookId= UserInputStatic.inputText("Введите номер каталога книги: ");
            String bookTitle = UserInputStatic.inputText("Введите название книги: ");
            String bookAuthor = UserInputStatic.inputText("Введите автора книги: ");

            Book book = new Book(bookId,bookTitle,bookAuthor);

            // возьмите ссылку на массив - в нем возьмите ячейку с номером, значение которого
            // хранится в переменной i (0,1,2...) и положите туда ссылку на только что
            // созданный экземпляр класса Book
            library[i] = book;

        }


        // выведем информацию о книгах в нашей библиотеке

        System.out.println(" -------- полный список книг ------------");

        for (int i = 0; i < library.length; i++) {
            Book currentBook = library[i];
            System.out.print("Номер каталога: " + currentBook.getBookId());
            System.out.print(", Автор книги: " + currentBook.getAuthor());
            System.out.print(", Название книги: " + currentBook.getTitle());
            System.out.println();
        }

        // если бы нужно было бы найти какую-то книгу по id, автору или названию
        // то мы это делали бы с помощью поиска по всем книгам

        String bookIdSearch = UserInputStatic.inputText("Книгу с каким номером каталога нужно найти:");

        // ищем по книгам
        for (int i = 0; i < library.length; i++) {
            Book currentBook = library[i];

            if (currentBook.getBookId().equals(bookIdSearch)){
                System.out.println("Нашли книгу по поиску:");
                System.out.print("Номер каталога: " + currentBook.getBookId());
                System.out.print(", Автор книги: " + currentBook.getAuthor());
                System.out.print(", Название книги: " + currentBook.getTitle());
                System.out.println();
            }
        }


    }
}
