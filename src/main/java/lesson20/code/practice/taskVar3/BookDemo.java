package lesson20.code.practice.taskVar3;

import lesson11.code.ifStatement.UserInputStatic;

public class BookDemo {
    public static void main(String[] args) {

        BookService bookService = new BookService();

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
                boolean addResult = bookService.addNewBook(library, currentQuantity);

                if (addResult) {
                    System.out.println("Книга добавлена успешно");
                    currentQuantity++;
                } else {
                    System.out.println("Добавить книгу не получилось. Возможно нет свободного места.");
                }

            }

            // напечатать всю информацию о книгах

            if (userChoice == 2) {
                bookService.printLibraryInfo(library, currentQuantity);

            }

            // если надо найти книгу по номеру в каталоге

            if (userChoice == 3) {
                bookService.findBookByCatalogNumber(library, currentQuantity);
            }

            // если надо найти книгу по автору

            if (userChoice == 4) {
                bookService.findBooksByAuthor(library, currentQuantity);
            }


            // если надо найти книгу по названию

            if (userChoice == 5) {
                bookService.findBooksByTitle(library, currentQuantity);
            }

            if (userChoice == 6) {
                System.out.println("Завершение работы с системой.");
                whileNotExit = false;
            }

        }

    }
}
