package lesson20.code.practice.taskVar1;

import lesson11.code.ifStatement.UserInputStatic;

public class BookDemoSimple {
    public static void main(String[] args) {

/*
экземпляры классов Book, которые мы создаем по очереди, мы сохраняем в ОТДЕЛЬНЫХ переменных
 */
        String bookId = UserInputStatic.inputText("Введите номер каталога книги: ");
        String bookTitle = UserInputStatic.inputText("Введите название книги: ");
        String bookAuthor = UserInputStatic.inputText("Введите автора книги: ");

        Book book1 = new Book(bookId, bookTitle, bookAuthor);

        bookId = UserInputStatic.inputText("Введите номер каталога книги: ");
        bookTitle = UserInputStatic.inputText("Введите название книги: ");
        bookAuthor = UserInputStatic.inputText("Введите автора книги: ");

        Book book2 = new Book(bookId, bookTitle, bookAuthor);


        bookId = UserInputStatic.inputText("Введите номер каталога книги: ");
        bookTitle = UserInputStatic.inputText("Введите название книги: ");
        bookAuthor = UserInputStatic.inputText("Введите автора книги: ");

        Book book3 = new Book(bookId, bookTitle, bookAuthor);


    }
}
