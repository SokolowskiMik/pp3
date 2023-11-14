package thinkjava;

public class IsAbecedarian {
    public static void main(String[] args) {
        isAbecedarian("abdest");
        System.out.println();
        isAbecedarian("aa");
        System.out.println();
        isAbecedarian("ba");
        System.out.println();
        isAbecedarian("abcb");
        System.out.println();
        isAbecedarian("aBcb");
        System.out.println();
        isAbecedarian("ABCb");
    }

    public static boolean isAbecedarian(String s) {
        boolean flag = true;
        s = s.toLowerCase();
        int len = s.length();
        for (int i=0; i<len-1; i++) {
            if ((int)s.charAt(i) > (int)s.charAt(i+1)) {
                flag = false;
                System.out.println(s.charAt(i)+" and " + s.charAt(i+1) + " " + flag);
            } else {
                System.out.println(s.charAt(i)+" and " + s.charAt(i+1) + " " + flag);
            }

        }
        return flag;
    }
}
