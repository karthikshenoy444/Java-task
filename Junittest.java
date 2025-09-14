package Library;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.example.library.model.Book;
import com.example.library.service.Library;



public class Junittest {
    private Library library;

    @Before
    public void setup() {
        library = new Library();
        library.addBook(new Book("Test Book", "Author", "1234"));
    }

    @Test
    public void testIssueBook() {
        boolean result = library.issueBook("1234", "Karthik");
        assertTrue(result);
    }

    @Test
    public void testReturnBook() {
        library.issueBook("1234", "Karthik");
        boolean result = library.returnBook("1234");
        assertTrue(result);
    }

    @Test
    public void testIsAvailable() {
        Book book = library.findBook("1234");
        assertTrue(book.isAvailable());
    }
}