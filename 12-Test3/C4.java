import java.util.*;
public class C4 {
    private String[] cityNames;

    public C4(String[] cityNames) {
        this.cityNames = cityNames;
    }

    public C4 filter(char c) {
        List<String> names = new ArrayList<>();

        for (int i=0; i<cityNames.length; i++) {
            if (cityNames[i].charAt(0) == c) {
                names.add(cityNames[i]);
            }
            // for (char letter:cityNames[i].toCharArray()) {
            //     if (c == cityNames[i].toCharArray()[0]) {
            //         names.add(cityNames[i]);
            //     }
            // }
        }
        String[] newNames = names.toArray(new String[0]);
        return new C4(newNames);
    }

    public String cities() {
        return String.join("",this.cityNames);
    }
}
