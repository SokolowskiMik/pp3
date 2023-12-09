import java.util.ArrayList;

public class Library {
    static ArrayList<Book> library = new ArrayList<>();

    public static void display() {
        for (Book i:library) {
            i.display();
            System.out.println(i.getClass());
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Book b1 = new Book("Brief History of Time", "Stephen Hawking");
        Ebook e1 = new Ebook("Pale Blue Dot", "Carl Sagan", "C_S_PaleBlueDot.pdf");
        Ebook e2 = new Ebook("Theory of everything", "Stephen Hawking", "S_H_TeoriaWszystkiego.pdf");
        AudioBook a1 = new AudioBook("Pale Blue Dot", "Carl Sagan", 450, 45);
        AudioBook a2 = new AudioBook("Theory of everything", "Stephen Hawking", 180,30);
        library.add(b1);
        library.add(e1);
        library.add(e2);
        library.add(a1);
        library.add(a2);
        Library.display();
        
    }
    
}
