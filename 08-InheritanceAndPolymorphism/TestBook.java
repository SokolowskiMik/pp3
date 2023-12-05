public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Brief History of Time", "Stephen Hawking");
        b1.display();
        System.out.println();
        System.out.println("Ebooks:");
        Ebook e1 = new Ebook("Pale Blue Dot", "Carl Sagan", "C_S_PaleBlueDot.pdf");
        Ebook e2 = new Ebook("Theory of everything", "Stephen Hawking", "S_H_TeoriaWszystkiego.pdf");
        e1.display();
        System.out.println();
        e2.display();

        System.out.println();
        System.out.println("Audiobooks:");

        AudioBook a1 = new AudioBook("Pale Blue Dot", "Carl Sagan", 450, 45);
        AudioBook a2 = new AudioBook("Theory of everything", "Stephen Hawking", 180,30);
        a1.display();
        System.out.println();
        a2.display();
    }
}
