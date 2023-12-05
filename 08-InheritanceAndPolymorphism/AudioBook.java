public class AudioBook extends Book {
    private int minutes;
    private int seconds;
    public AudioBook(String title, String author, int minutes, int seconds) {
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }

    public void display() {
        System.out.printf("Title: %s \nAuthor: %s \nDuration:%03d:%02d", getTitle(), getAuthor(),getMinutes(), getSeconds());
        System.out.println();
    }
}
