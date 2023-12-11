public class FileSystemExample {
    public static void main(String[] args) {
        // Create a folder
        Folder myFolder = new Folder("My Documents");

        // Add two files to the folder
        File fileToRemove = new File("Document1.txt", 1024, "Content of Document 1");
        myFolder.addFile(fileToRemove);
        myFolder.addFile(new File("Document2.txt", 2048, "Content of Document 2"));

        // Display the folder contents
        myFolder.displayContents();
        
        // Add another file to the folder
        myFolder.addFile(new File("Document3.txt", 3072, "Content of Document 3"));

        // Display the folder contents
        myFolder.displayContents();

        // Remove the named file from the folder

        myFolder.removeFile(fileToRemove);

        // Display the folder contents
        myFolder.displayContents();
    }
}