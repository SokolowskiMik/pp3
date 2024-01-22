public class C1 {
    private String name;
    private String surname;
    
    public C1(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("%s%s",this.name.substring(0,1).toUpperCase(), this.surname.substring(0,1)).toUpperCase();
    }

    
}