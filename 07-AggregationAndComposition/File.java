public class File {
    private String name;
    private long size;
    private String content;



    
    public File(String name, long size, String content) {
        this.name = name;
        this.size = size;
        this.content = content;
    }




    public String getName() {
        return name;
    }




    public long getSize() {
        return size;
    }




    public String readContent() {
        return this.content;
    }
}
