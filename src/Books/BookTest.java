package Books;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testGetAuthor() {
        Book book = new Book("J.K. Rowling", "Harry Potter", 500);
        assertEquals("J.K. Rowling", book.getAuthor());
    }

    @Test
    public void testSetAuthor() {
        Book book = new Book("J.K. Rowling", "Harry Potter", 500);
        book.setAuthor("Stephen King");
        assertEquals("Stephen King", book.getAuthor());
    }

    @Test
    public void testGetTitle() {
        Book book = new Book("J.K. Rowling", "Harry Potter", 500);
        assertEquals("Harry Potter", book.getTitle());
    }

    @Test
    public void testSetTitle() {
        Book book = new Book("J.K. Rowling", "Harry Potter", 500);
        book.setTitle("The Lord of the Rings");
        assertEquals("The Lord of the Rings", book.getTitle());
    }

    @Test
    public void testGetPages() {
        Book book = new Book("J.K. Rowling", "Harry Potter", 500);
        assertEquals(500, book.getPages());
    }

    @Test
    public void testSetPages() {
        Book book = new Book("J.K. Rowling", "Harry Potter", 500);
        book.setPages(600);
        assertEquals(600, book.getPages());
    }

    @Test
    public void testToString() {
        Book book = new Book("J.K. Rowling", "Harry Potter", 500);
        String expected = "| J.K. Rowling | Harry Potter | 500 |";
        assertEquals(expected, book.toString());
    }
}
