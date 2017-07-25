/**
 * Created by rasalp on 7/20/2017.
 */
public class Book {
    private int bookId;
    private int numberOfPages;
    private String author;
    private String authorLastName;
    private String title;

    public Book(String author, String authorLastName) {
        this.author = author;
        this.authorLastName = authorLastName;
    }

    public Book(int bookId, int numberOfPages, String title) {
        this.bookId = bookId;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.title = title;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return this.bookId + " " + this.numberOfPages + " " + this.author + " " + this.title;
    }
}
