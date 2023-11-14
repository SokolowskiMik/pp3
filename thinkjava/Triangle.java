package thinkjava;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("pass in 3 integers to make a triangle: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        if ((a <= 0) || (b <= 0) || (c <= 0)){
            System.err.println("the lengths can't be negative or zero");
            return;
        }
        if (((a+b)<=c) || ((a+c)<=b) || ((b+c)<= a)) {
            System.out.println("You can't form a triangle because one side is too long");
            return;
        }
        else {
            System.out.println("you can form a triangle");
        }
    }
}
