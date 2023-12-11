public class Book {
    protected String title;
    private Publisher publisher;
    private String yearOfPublication;
    private Writer2 author;

    

    public Book(String title, String author, Publisher publisher, String yearOfPublication, Writer2 writer) {
        this.title = title;
        this.author = writer;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Writer2 getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Writer2 author) {
        this.author = author;
    }

    public void display() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author.getFullName());
        System.out.println("Publisher: " + publisher.getName() + ", City: " + publisher.getCity());
        System.out.println("Year of Publication: " + yearOfPublication);
    }
}