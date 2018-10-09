import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void beforeEach(){
        book = new Book("The Code Of The Woosters","P.G.Wodehouse","Humour");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Code Of The Woosters", book.getTitle() );
    }

    @Test
    public void hasAuthor(){
        assertEquals("P.G.Wodehouse", book.getAuthor() );
    }

    @Test
    public void hasGenre(){
        assertEquals("Humour", book.getGenre() );
    }
}
