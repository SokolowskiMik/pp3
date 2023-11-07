import java.time.Year;

public class DrivingLicence {
    private String name;
    private String surname;
    private String address;
    private String postCode;
    private String city;
    private String licenceNumber;
    private int yearOfIssue;
    private String category;

    final int CURRENT_YEAR = Year.now().getValue();
    
    public DrivingLicence(String name, String surname, String address, String postCode, String city,
            String licenceNumber, int yearOfIssue, String category) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.postCode = postCode;
        this.city = city;
        this.licenceNumber = licenceNumber;
        this.yearOfIssue = yearOfIssue;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name.substring(0,1).toUpperCase()+
        name.substring(1).toLowerCase();
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue >= 1980 && yearOfIssue <= CURRENT_YEAR) {
            this.yearOfIssue = yearOfIssue;
        }
        else {
            System.out.println("Year of issue must be between 1980 and the current year:"+CURRENT_YEAR);
        }
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void display() {
        System.out.println("Name:"+getName()+"\nSurname:"+getSurname()+"\naddress:" + getAddress()+"\nPostal code:"+getPostCode()+"\ncity:" +getCity()+
        "\nlicense number:"+getLicenceNumber()+"\nYear of issue:"+getYearOfIssue()+"\nCategory:"+getCategory());
        System.out.println();
    }

    @Override
    public String toString() {
        return "DrivingLicence [name=" + name + ", surname=" + surname + ", address=" + address + ", postCode="
                + postCode + ", city=" + city + ", licenceNumber=" + licenceNumber + ", yearOfIssue=" + yearOfIssue
                + ", category=" + category + "]";
    }

    
}
