import java.util.*;

public class BookCase {
    private List<Book2> books;


    
    public BookCase() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book2 book) {
        this.books.add(book);
    }

    public void removeBook(Book2 book) {
        this.books.remove(book);
    }
}
