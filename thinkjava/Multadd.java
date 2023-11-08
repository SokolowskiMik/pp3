package thinkjava;

public class Multadd {
    public static void main(String[] args) {
        System.out.println(multAdd(1.0,2.0,3.0));
        System.out.println(multAdd(Math.sin(Math.PI/4),Math.cos(Math.PI/4)/2,0.0));
        System.out.println(multAdd(Math.log(10),Math.log(20),0.0));
        System.out.println(expSum(1));
    }

    public static double multAdd(double a, double b, double c) {
        return a*b+c;
    }

    public static double expSum(double x) {
        return multAdd(x*Math.exp(-x),Math.sqrt(1-Math.exp(-x)),0.0);
    }
}
