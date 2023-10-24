public class NumOperations {
    
    public static int maks(int a, int b) {
        return Math.max(a,b);
    }

    public static double pi() {
        return Math.PI;
    }

    public static int abVal(int val) {
        return Math.abs(val);
    }

    public static double squareRoot(double a) {
        double value = a;
        return Math.sqrt(value);
    }

    public static double randomNum() {
        return Math.random();
    }

    public static double zeroToTen() {
        return (int)(Math.random()*11);
    }

    public static double sinus(double degrees) {
        double value = degrees*(Math.PI/180);
        return Math.sin(value);
    }    
}
