package thinkjava;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.print(squareRoot(9.00));
    }

    public static String squareRoot(double a) {
        double x0 = a/2;
        double x1 = (x0+a/x0)/2;
        int i = 0;
        while (x0-x1 >= 0.0001){
            x0 = x1;
            x1 = (x0+a/x0)/2;
            i++;
        }
        return String.format("x%d = %f",i,x1);
    }
}
