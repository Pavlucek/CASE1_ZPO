package PublishHouse;
import Books.Book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WydawnictwoTest {
    @Test
    public void testCreateBook() {
        Wydawnictwo w = Wydawnictwo.getWydawnictwo("Adam Mickiewicz");
        Book k = w.createBook("Dziady", 130);
        assertTrue(k instanceof Poemat);
        assertEquals("Adam Mickiewicz", k.getAuthor());
        assertEquals("Dziady", k.getTitle());
        assertEquals(130, k.getPages());

        w = Wydawnictwo.getWydawnictwo("Stephen King");
        k = w.createBook("Carrie", 200);
        assertTrue(k instanceof ThrillerMedyczny);
        assertEquals("Stephen King", k.getAuthor());
        assertEquals("Carrie", k.getTitle());
        assertEquals(200, k.getPages());

        w = Wydawnictwo.getWydawnictwo("Henryk Sienkiewicz");
        k = w.createBook("Krzyżacy", 500);
        assertTrue(k instanceof PowiescHistoryczna);
        assertEquals("Henryk Sienkiewicz", k.getAuthor());
        assertEquals("Krzyżacy", k.getTitle());
        assertEquals(500, k.getPages());
    }

    @Test
    public void testGetWydawnictwo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Wydawnictwo.getWydawnictwo("Nieznany Autor");
        });
    }
}

