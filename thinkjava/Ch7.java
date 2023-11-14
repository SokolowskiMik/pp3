package thinkjava;
import java.util.Arrays;
public class Ch7 {

    public static int indexOfMax(int[] a) {
        int max = 0;
        int index = 0;
        for (int i=0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    public static boolean[] sieve(int n) {
        // Create a boolean array to store whether each number is prime
        boolean[] isPrime = new boolean[n];

        // Initialize all entries of the array to true
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Apply the Sieve of Eratosthenes algorithm
        for (int i = 2; i * i < n; i++) {
            // If i is prime, mark all multiples of i as not prime
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
    

    public static boolean areFactors(int n, int[] a) {
        for (int i: a) {
            if (n%i != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static boolean arePrimeFactors(int n, int[] a) {
        for (int i: a) {
            if (n%i != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static String letterHist(String s) {
        s = s.toLowerCase();
        int[] count = new int[26];
        System.out.println(Arrays.toString(s.toCharArray()));
        for (char c:s.toCharArray()) {
            int index = c - 'a';
            count[index]++;
        }
        return Arrays.toString(count);
    }

    public static boolean isAnagram(String s1, String s2) {
        String lowerS1 = s1.toLowerCase();
        String lowerS2 = s2.toLowerCase();
        char[] lettersInS1 = lowerS1.toCharArray();
        int[] countS1 = new int[26];
        char[] lettersInS2 = lowerS2.toCharArray();
        int[] countS2 = Arrays.copyOf(countS1,countS1.length);

        for (char letter:lettersInS1) {
            int index = letter - 'a';
            countS1[index]++;
        }
        for (char letter:lettersInS2) {
            int index = letter - 'a';
            countS2[index]++;
        }

        for (int i=0; i<countS1.length; i++) {
            if (countS1[i] != countS2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // int a[] = {0,10,3,5,4,3,2,7,9,21,2};
        System.out.println(isAnagram("allendowney", "wellannoyed"));
    
    }
}
