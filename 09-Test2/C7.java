import java.util.*;
public class C7 {

    public static void main(String[] args) {
        String[] citiesArray = {"Warszawa", "Sopot", "Kielce", "Szczecin"};
        C7 citiesObject = new C7(citiesArray);

        C7 filteredCities = citiesObject.filter('S');
        System.out.println(filteredCities.cities());
    }
    private String[] cityNames;

    public C7(String[] cityNames) {
        this.cityNames = cityNames;
    }
    
    public C7 filter(char c) {
        ArrayList<String> aL = new ArrayList<>();
        for (String city:cityNames) {
            char[] nameArray = city.toCharArray();
            if (nameArray[0] == c) {
                aL.add(city);
            }
        }
        String[] newCities = new String[aL.size()];
        newCities = aL.toArray(newCities);

        return new C7(newCities);
    }

    public String cities() {
        return String.join("",this.cityNames);
    }
}
