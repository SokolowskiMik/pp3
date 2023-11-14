package thinkjava;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("pass in 3 integers to solve the quadratic formula for them: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        if (a == 0) {
            System.out.println("a can't be equal to 0");
            return;
        }
        int delta = b*b - 4*a*c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.printf("result: x1 = %.2f x2 = %.2f",x1,x2);
        }
        else if (delta == 0) {
            double x0 = -b/(2*a);
            System.out.printf("result: x0 = %.2f",x0);
        }
        else if (delta < 0) {
            System.out.println("there is no solution");
            return;
        }
    }
    
}
