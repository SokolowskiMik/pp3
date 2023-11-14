package thinkjava;

public class CanSpell {
    public static void main(String[] args) {
        System.out.println(canSpell("quijibo","jib"));
        System.out.println(canSpell("qbuijibo","jiibb"));
        System.out.println(canSpell("quijibo","jibc"));
    }
    public static boolean canSpell(String s1, String s2) {
        String c = "";
        int indexOfCharacter;
        for (int i=0; i<s2.length(); i++) {
            c = s2.substring(i,i+1);
            if (s1.indexOf(c) < 0) {
                return false;
            }
            indexOfCharacter = s1.indexOf(c);
            s1 = s1.substring(0,indexOfCharacter) + s1.substring(indexOfCharacter+1);
        }
        return true;
    }
}
