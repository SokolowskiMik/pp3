public class Alphabet {
    public static boolean isAlphabet(String t) {
        
        char[] charArray = t.toCharArray();

        for (int i=0; i < charArray.length-1; i++) {
            if (charArray[i] - charArray[i+1] > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Alphabet.isAlphabet("abegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhsw"));
    }
}
