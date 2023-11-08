package thinkjava;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a temperature in Celsius:");
        celsius = in.nextDouble();
        in.close();
        fahrenheit = celsius * (9.0/5.0) + 32;
        System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);
        
    }
}
