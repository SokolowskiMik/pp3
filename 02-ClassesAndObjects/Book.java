public class Book {
    String title;
    String author;
    String publisher;
    String category;
    int pages;
    int price;
    int currentPage = 0;
    boolean isOpen = false;


    void OpenBook() {
        String openStatus = isOpen ? "Book already open" : "Book has been open";
        if (isOpen != true) {
            isOpen = true;
        }
        System.out.println(openStatus);
    }

    void CloseBook() {
        if (isOpen = true) {
            isOpen = false;
            System.out.println("Book has been closed");
        }
        else {
            System.out.println("Book is already closed");
        }
    }

    void ShowCurrentPage() {
        if (isOpen) {
            System.out.println("Current page: " + currentPage);
        }
        else {
            System.out.println("You need to open the book first");
        }
    }

    void ReadPage() {
        currentPage += 1;
        System.out.println("You read one page!");
    }
}
