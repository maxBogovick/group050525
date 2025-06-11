package lesson21.code.practice.junitObjects;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public boolean addNewBook(Book newBook) {

        if (validateNewBook(newBook)) {
            return bookRepository.save(newBook);
        } else {
            return false;
        }

    }

    private boolean validateNewBook(Book newBook) {
        if (newBook.getId().isBlank()) {
            return false;
        }
        if (newBook.getAuthor().isBlank()) {
            return false;
        }
        if (newBook.getTitle().isBlank()) {
            return false;
        }

        if (bookRepository.findByBookId(newBook.getId()) != null) {

            return false;
        }


        return true;
    }

    public Book findBookById(String bookId){

        return bookRepository.findByBookId(bookId);
    }

}
