import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    Book book2;
    Book book3;

    @Before
    public void beforeEach(){
        library = new Library(3);
        book = new Book("Moby Dick","Herman Melville","Fiction");
        book2 = new Book("Death At Seaworld","David Kirby","Non-fiction");
        book3 = new Book("Jaws","Peter Benchley","Fiction");
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
    public void libraryNotFull(){
        assertEquals(false, library.checkIsFull() );
    }

    @Test
    public void libraryFull(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(true, library.checkIsFull());
    }

    @Test
    public void canGenreCount(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.bookCount() );
        library.genreCount();
        assertEquals(2, library.getGenreCount().size() );
    }

}
