package lesson21.code.practice.junitObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    private int repositorySize = 3;
    private BookRepository bookRepository = new BookRepository(repositorySize);
    private BookService service = new BookService(bookRepository);


    @Test
    void testAddNewBook() {

        Book testBook = new Book("1", "Три мушкетера", "Дюма");

        boolean saveResult = service.addNewBook(testBook);
        // что мы проверяем?
        // а) изменение количество сохраненных книг
        // б) проверить, что сохранение в массив произведено

        assertTrue(saveResult);
        assertEquals(1, bookRepository.getCurrentQuantity());

    }

    @Test
    void testFindBookById() {

        Book testBook = new Book("1", "Три мушкетера", "Дюма");

        service.addNewBook(testBook);
        // что мы проверяем?
        // а) что книга с id таким-то есть в репозитории

        Book foundedBook = service.findBookById("1");

        // не забываем в классе Book переопределить метод equal()
        assertEquals(testBook, foundedBook);

    }

    @Test
    void testAddNewBookAlreadyExist1(){
        Book book1 = new Book("1","Java","Author1");
        Book book2 = new Book("1","HTML","Author2");

        boolean saveResult1 = service.addNewBook(book1);
        boolean saveResult2 = service.addNewBook(book2);

        assertTrue(saveResult1);
        assertFalse(saveResult2);

    }

    @Test
    void testAddNewBookAlreadyExist2(){
        Book book1 = new Book("1","Java","Author1");
        Book book2 = new Book("1","HTML","Author2");

        service.addNewBook(book1);
        service.addNewBook(book2);

        assertEquals(1,bookRepository.getCurrentQuantity());

    }


}