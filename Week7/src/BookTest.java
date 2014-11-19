import org.junit.*;
import static org.junit.Assert.*;

public class BookTest
{
    @Test
    public void testBook()
    {
        Book book1 = new Book("Terry Pratchet", "The Light Fantastic");
        Book book2 = new Book("J.R.R Tolkien", "The Lord of the Rings - The Return of the King");
        String author1 = "Terry Pratchet";
        String author2 = "J.R.R Tolkien";
        String title2 = "The Lord of the Rings - The Return of the King";
        String title1 = "The Light Fantastic";
        assertEquals(book1.getAuthor(), author1);
        assertEquals(book1.getAuthor(), book2.getAuthor());
        assertEquals(book1.getTitle(), title1);
        assertEquals(book2.getAuthor(), author2);
        assertEquals(book2.getTitle(), title2);
    }    
}