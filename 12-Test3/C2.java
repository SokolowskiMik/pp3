public class C2 {
    public static boolean isogram(String s) {
        int counter = 0;
        for (char c:s.toCharArray()) {
            for (char compare:s.toCharArray()) {
                if (c == compare) {
                    counter ++;
                }
            }

        }
        if (counter == s.length()) {
            return true;
        }
        return false;
    }
}
