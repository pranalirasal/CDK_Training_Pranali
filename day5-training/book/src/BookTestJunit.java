import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * Created by rasalp on 7/20/2017.
 */
public class BookTestJunit {
    @Test
    public void testSortBookIDs() {
        List<Book> books =   BookTest.createTestData();
        Collections.sort(books, new CompareBookIDs());
        for (Book book : books) {
            System.out.println(book);
        }
    }
    @Test
    public void testSortBookPages() {
        List<Book> books =   BookTest.createTestData();
        Collections.sort(books, new CompareBookPages());
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
