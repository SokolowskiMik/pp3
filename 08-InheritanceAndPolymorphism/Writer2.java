public class Writer2 {
    private String firstName;
    private String lastName;
    private String literaryGenre;
    public Writer2(String firstName, String lastName, String literaryGenre) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.literaryGenre = literaryGenre;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
}
