import java.util.*;

public class Book2 {
    private Writer author;
    private String title;
    private int pages;
    private int currentPage = 0;
    private boolean isOpen = false;
    private List<Chapter> chapters;


    

    public Book2(Writer author, String title, int pages, int currentPage, boolean isOpen) {
        this.chapters = new ArrayList<>();
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.currentPage = currentPage;
        this.isOpen = isOpen;
    }

    public void openBook() {
        if (isOpen) {
            System.out.println("Book is already open");
        } else {
            isOpen = true;
            System.out.println("You've opened a book");
        }
    }


    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public void removeChapter(Chapter chapter) {
        chapters.remove(chapter);
    }

    public void displayPage() {
        System.out.println("You are on page: " + this.currentPage);
    }

    public void readPage() {
        if (currentPage+1 < pages) {
            this.currentPage ++;
        } else {
            System.out.println("You have read the whole book!");
        }
    }
}
