import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void beforeEach(){
        library = new Library(50);
    }

    @Test
    public void bookCount(){
        assertEquals(0, library.bookCount() );
    }

    @Test
    public void addBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount() );
    }

    @Test
    public void libraryFull(){
        assertEquals(false, library.checkIsFull() );
    }
}
