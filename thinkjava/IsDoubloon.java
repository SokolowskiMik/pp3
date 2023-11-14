package thinkjava;
import java.util.Arrays;
public class IsDoubloon {
    public static void main(String[] args) {
        System.out.println(isDoubloon("Anna"));
        
        System.out.println(isDoubloon("Toto"));
        
        System.out.println(isDoubloon("ABCd"));
        
        System.out.println(isDoubloon("Abba"));
        
        System.out.println(isDoubloon("aaaaaaaaaa"));
        
        System.out.println(isDoubloon("aBcb"));
        
        System.out.println(isDoubloon("Shanghaiings"));
        
        System.out.println(isDoubloon("abb"));
        
    }

    public static boolean isDoubloon1(String s) {
        String c = "";
        boolean flag = true;
        int count;
        s = s.toLowerCase();
        int len = s.length();
        for (int i = 0; i<len; i++) {
            c = s.substring(i,i+1);
            count = 0;
            for (int j=0; j<len; j++) {
                String check = s.substring(j,j+1);
                if (c.compareTo(check) == 0) {
                    count++;
                }
            }
            if (count != 2) {
                return false;
            }
        }
        return flag;
    }

    public static boolean isDoubloon2(String str) {
        str = str.toLowerCase();
        for (char c ='a'; c <= 'z'; c++) {
            int count = 0;
            for (int i=0; i < str.length(); i++) {
                if (str.charAt(i)==c) {
                    count ++;
                }
            }
            if (count != 2 && count != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDoubloon(String s) {
        // count the number of times each letter appears
        int[] counts = new int[26];
        String lower = s.toLowerCase();
        for (char letter : lower.toCharArray()) {
            int index = letter - 'a';
            counts[index]++;
        }
        // determine whether the given word is a doubloon
        for (int count : counts) {
            if (count != 0 && count != 2) {
                return false;
            }
        }
        return true;
    }
        
}
