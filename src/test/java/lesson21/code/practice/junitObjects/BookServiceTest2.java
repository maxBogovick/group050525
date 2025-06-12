package lesson21.code.practice.junitObjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BookServiceTest2 {

    private int repositorySize = 3;
    private BookRepository bookRepository = new BookRepository(repositorySize);
    private BookService service = new BookService(bookRepository);

    @BeforeEach
    void setup() {
        Book testBook = new Book("1", "Три мушкетера", "Дюма");
        boolean saveResult = service.addNewBook(testBook);
    }


    @Test
    void testAddNewBook() {

        // что мы проверяем?
        // а) изменение количество сохраненных книг

        assertEquals(1, bookRepository.getCurrentQuantity());

    }

    @Test
    void testFindBookById() {
        Book testBook = new Book("1", "Три мушкетера", "Дюма");

        // что мы проверяем?
        // а) что книга с id таким-то есть в репозитории

        Book foundedBook = service.findBookById("1");

        // не забываем в классе Book переопределить метод equal()
        assertEquals(testBook, foundedBook);

    }

    @Test
    void testAddNewBookAlreadyExist1() {
        Book book2 = new Book("1", "HTML", "Author2");

        boolean saveResult2 = service.addNewBook(book2);

        assertFalse(saveResult2);

    }

    @Test
    void testAddNewBookAlreadyExist2() {
        Book book2 = new Book("1", "HTML", "Author2");

        service.addNewBook(book2);

        assertEquals(1, bookRepository.getCurrentQuantity());

    }


}