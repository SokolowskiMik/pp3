package thinkjava;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        int seconds,minutes,hours,secondsLeft;
        final int SECONDS_IN_MINUTES=60;
        final int SECONDS_IN_HOURS=3600;

        Scanner in = new Scanner(System.in);

        System.out.println("Write a number of seconds: ");
        seconds = in.nextInt();
        in.close();

        hours = seconds/SECONDS_IN_HOURS;
        secondsLeft = seconds - hours*SECONDS_IN_HOURS;
        minutes = secondsLeft/SECONDS_IN_MINUTES;
        secondsLeft -= minutes*SECONDS_IN_MINUTES;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", seconds, hours, minutes, secondsLeft);

    }
}
