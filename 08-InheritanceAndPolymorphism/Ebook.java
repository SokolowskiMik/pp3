public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, Publisher publisher, String fileName) {
        super(title, author, publisher);
        this.fileName = fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void display() {
        System.out.println("Title: " + getTitle() + "\nAuthor:" + getAuthor() + "\nFile name: " + getFileName());
    }
}
