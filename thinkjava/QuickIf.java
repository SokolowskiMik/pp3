package thinkjava;
import java.util.Scanner;
public class QuickIf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("pass in a digit: ");
        int x = in.nextInt();
        if (x > 0 && x < 10) {
            System.out.println("Positive single digit number");
        }
        in.close();
    }
}
