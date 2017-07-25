import java.util.Comparator;

/**
 * Created by rasalp on 7/20/2017.
 */
public class CompareBookIDs implements Comparator<Book>{
    public int compare (Book b1, Book b2) {
        return (b1.getBookId() - b2.getBookId());
    }
}
