package lesson06.code.classConstructor;

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library("Библиотека им. Некрасова", "Юрмала",125);

        library.printInfo();

        library.issueBook();
        library.issueBook();
        library.issueBook();

        library.printInfo();

        library.returnBook();

        library.printInfo();
    }
}
