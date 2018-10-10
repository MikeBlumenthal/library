import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BorrowerTest {
    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void beforeEach(){
        borrower = new Borrower();
        book = new Book("Jaws","Peter Benchley", "Fiction");
        library = new Library(10);
    }

    @Test
    public void borrowBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
//        assertEquals(0, borrower.bookCount());
        borrower.borrowBook(library);
//        assertEquals(0, library.bookCount());
//        assertEquals(1, borrower.bookCount());
    }

}
