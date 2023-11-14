public class WorkingOnStrings {
    public static void main(String[] args) {
        String str = "Have a nice day!";
        System.out.println(str.length());
        System.out.println(str.substring(0,9));
        System.out.println(str.endsWith("day!"));
        System.out.println(!str.isEmpty());
        System.out.println(str.lastIndexOf("e"));
        System.out.println(str.replace(" ", "-"));
        System.out.println(str.toUpperCase());
    }
}
