package thinkjava;

public class Gauss {
    public static void main(String[] args) {
        System.out.printf("%f and %f",gauss(2.00,2),(Math.pow(-1,2)*Math.pow(2,4)/2));
    }
    public static double gauss(double x, double n) {
        double oneToPower = 1;
        double xToPower = x;
        double factorial = 1;
        double exp = 0;
        for (double i = n; i>0; i--) {
            oneToPower = oneToPower * -1;
            factorial = factorial*i;
        }
        for (double j = 2; j<=2*n; j++) {
            xToPower = xToPower * x;
        }
        exp = oneToPower*xToPower/factorial;

        return exp;
    }
}
