package thinkjava;

import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        int myNumber, numberGuessed=0, off;
        boolean condition = true;

        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        myNumber = rand.nextInt(100)+1;

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        
        while (condition) {
            if (numberGuessed == myNumber) {
                System.out.println("Your guess is: " + numberGuessed);
                System.out.println("The number I was thinking of is: " + myNumber);
                System.out.println("You win!!");
                condition = false;
                in.close();
            }
            else {
                System.out.print("Type a number: ");
                numberGuessed = in.nextInt();
                System.out.println("\nYour guess is: " + numberGuessed);
                off = Math.abs(myNumber-numberGuessed);
                System.out.printf("You were off by: %d", off);
                System.out.println("\nTry again!\n");
            }
        }

    }
}
