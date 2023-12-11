import java.util.*;

public class Writer {
    private String name;
    private int age;
    private List<String> writtenBooks = new ArrayList<>();

    public void writeBook() {
        System.out.println(name+ " is writing a book");
    }
}
