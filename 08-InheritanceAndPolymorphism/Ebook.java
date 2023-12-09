public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, String fileName) {
        super(title, author);
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
