public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence("Jan", "Nowak","Rakowicka 32b","31-157","Krakow","1325215MBS",2023,"B");
        dl.display();
        System.out.println(dl);
        dl.setYearOfIssue(2023);
        dl.setName("AREK");
        dl.display();
    }
}

