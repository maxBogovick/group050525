package lesson21.code.practice.junitObjects;

public class BookRepository {

    private Book[] library;
    private int currentQuantity = 0;

    public BookRepository(int librarySize) {
        this.library = new Book[librarySize];
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public boolean save(Book book) {
        if (currentQuantity < library.length) {
            library[currentQuantity] = book;
            currentQuantity++;
            return true;
        } else {
            return false;
        }
    }


    public Book findByBookId(String bookIdSearch) {

        for (int i = 0; i < currentQuantity; i++) {

            if (library[i].getId().equals(bookIdSearch)) {
                return library[i];
            }
        }

        return null;
    }




}
