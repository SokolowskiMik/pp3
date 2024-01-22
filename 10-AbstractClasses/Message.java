public abstract class Message {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public Message() {
        setText("");
    }

    public Message(String text) {
        this.text = text;
    }

    public int charNumber() {
        return this.text.length();
    }
    
    public void send() {
        System.out.println(String.format("Contents: %s, char number: %d", this.text, this.charNumber()));
    }
}
