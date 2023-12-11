import java.util.*;

public class Folder {
    private String name;
    private List<File> files;



    
    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void removeFile(File file) {
        this.files.remove(files.indexOf(file));
    }

    public void displayContents() {
        System.out.println("Folder Contents (" + name + "):");
        for (File file : files) {
            System.out.println("File: " + file.getName() + ", Size: " + file.getSize() + " bytes");
        }
        System.out.println();
    }
}
