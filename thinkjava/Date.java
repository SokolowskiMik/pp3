package thinkjava;

public class Date {
    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");
        printAmerican("Monday",22,"July",2019);
    }

    public static void printAmerican(String day, int date, String month, int year) {
        String americanDate = day+", "+month+" "+date+", "+year;
        System.out.println(americanDate);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        String europeanDate = day+", "+date+" "+month+", "+year;
        System.out.println(europeanDate);
    }
}
