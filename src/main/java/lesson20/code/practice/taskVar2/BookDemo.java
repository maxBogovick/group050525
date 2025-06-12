package lesson20.code.practice.taskVar2;

import lesson11.code.ifStatement.UserInputStatic;

public class BookDemo {
    public static void main(String[] args) {

        // запросим у пользователя количество книг
        int librarySize = UserInputStatic.inputInt("Сколько книг в библиотеке: ");
        int currentQuantity = 0;

        // создадим массив для хранения такого количества экземпляров класса Book,
        // сколько у нас должно быть книг
        Book[] library = new Book[librarySize];
        boolean whileNotExit = true;

        while (whileNotExit) {

            System.out.println("-------------------------");
            System.out.println("Виды операций:");
            System.out.println("1. Создать новую книгу");
            System.out.println("2. Вывод информации о всех книгах");
            System.out.println("3. Поиск книги на номеру каталога");
            System.out.println("4. Поиск книг на автору");
            System.out.println("5. Поиск книги на названию");
            System.out.println("6. Завершение работы");
            System.out.println("-------------------------");

            int userChoice = UserInputStatic.inputInt("Выберите вид операции:");

            // если пользователь выбрал пункт - создать новую книгу
            if (userChoice == 1) {

                if (currentQuantity < library.length) {

                    String bookId = UserInputStatic.inputText("Введите номер каталога книги: ");
                    String bookTitle = UserInputStatic.inputText("Введите название книги: ");
                    String bookAuthor = UserInputStatic.inputText("Введите автора книги: ");

                    Book book = new Book(bookId, bookTitle, bookAuthor);

                    library[currentQuantity] = book;
                    currentQuantity++;
                    System.out.println("Книга успешно добавлена");
                } else {
                    System.out.println("Книгу добавить не можем - нет свободного места");
                }
            }

            // напечатать всю информацию о книгах

            if (userChoice == 2) {

                System.out.println(" -------- полный список книг ------------");

                for (int i = 0; i < currentQuantity; i++) {

                    Book currentBook = library[i];
                    System.out.print("Номер каталога: " + currentBook.getBookId());
                    System.out.print(", Автор книги: " + currentBook.getAuthor());
                    System.out.print(", Название книги: " + currentBook.getTitle());
                    System.out.println();
                }
            }

            // если надо найти книгу по номеру в каталоге

            if (userChoice == 3) {
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

            // если надо найти книгу по автору

            if (userChoice == 4) {
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


            // если надо найти книгу по названию

            if (userChoice == 5) {
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

            if (userChoice == 6) {
                System.out.println("Завершение работы с системой.");
                whileNotExit = false;
            }

        }

    }
}
