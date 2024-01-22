import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // C1 person = new C1("anna", "may");
        // System.out.println(person.toString());  // Output: "AM"

        // System.out.println(C2.isogram("red sun"));        // Output: true
        // System.out.println(C2.isogram("blue water"));      // Output: false
        // System.out.println(C2.isogram("BLUE water"));      // Output: true
        // System.out.println(C2.isogram("my blue water")); 

        // boolean[] arr1 = {true, false, false};
        // boolean[] arr2 = {true, false, true, false};
        // boolean[] arr3 = {true, false, true, true, false, true, false, true, false};

        // System.out.println(new C3(arr1).opposite());  // Output: 0
        // System.out.println(new C3(arr2).opposite());  // Output: 2
        // System.out.println(new C3(arr3).opposite());  // Output: 5



        // String[] arr = {"Warszawa", "Sopot", "Kielce", "Szczecin"};

        // // Create Cities object with initial array
        // C4 citiesObject = new C4(arr);

        // // Filter cities whose names start with 'S' and print the result
        // C4 filteredCities = citiesObject.filter('S');
        // System.out.println(filteredCities.cities());  // Output: "SopotSzczecin"

        // int[] arr1 = {6, 7, 6, 1, 4};
        // int[] arr2 = {2, 5, 2, 8, 4};

        // // Create Numbers objects with initial arrays and print the result of the ok() method
        // System.out.println(new Numbers(arr1).ok());  // Output: true
        // System.out.println(new Numbers(arr2).ok());  // Output: false


        // Example usage of the Product class and sorting
        Product[] arr = {
            new Product("milk", 5),
            new Product("cheese", 2),
            new Product("ham", 9)
        };

        System.out.println("Before sorting:");
        for (Product p : arr) {
            System.out.println(p);
        }

        Arrays.sort(arr);

        System.out.println("After sorting:");
        for (Product p : arr) {
            System.out.println(p);
        }
    }
}
