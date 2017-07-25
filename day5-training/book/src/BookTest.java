import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by rasalp on 7/20/2017.
 */
public class BookTest {
    public static void main(String[] args) {
        List<Book> books =   createTestData();
        Collections.sort(books, new CompareBookIDs());
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static List<Book> createTestData() {
        Book b1 = new Book(201, 150,  "Harry Potter");
        Book b2 = new Book(209, 300, "Oath of Vayuputras");
        Book b3 = new Book(203, 450, "Not Without My Daughter");
        Book b4 = new Book(222, 123, "Twilight");

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        return books;
    }
    public static List<Book> createNameData() {
        Book b1 = new Book("Joanne", "Rowling");
        Book b2 = new Book(209, 300, "Oath of Vayuputras");
        Book b3 = new Book(203, 450, "Not Without My Daughter");
        Book b4 = new Book(222, 123, "Twilight");

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        return books;
    }
}
