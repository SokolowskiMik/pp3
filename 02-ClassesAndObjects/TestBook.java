public class TestBook {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "book1";
        b.author = "rob";
        b.publisher = "NT";
        b.category = "comedy";
        b.pages = 120;
        b.price = 20;

        Book b2 = new Book();
        b2.title = "book1";
        b2.author = "rob";
        b2.publisher = "NT";
        b2.category = "comedy";
        b2.pages = 120;
        b2.price = 20;

        b.OpenBook();
        b.CloseBook();
        b.ShowCurrentPage();
        b.OpenBook();
        b.ShowCurrentPage();
        b.ReadPage();
        b.ReadPage();
        b.ShowCurrentPage();

        b2.OpenBook();
        b2.ShowCurrentPage();
        b2.ReadPage();
        b2.ShowCurrentPage();
    }
}
