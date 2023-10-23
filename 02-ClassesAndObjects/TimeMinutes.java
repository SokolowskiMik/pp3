public class TimeMinutes {
    public static void main(String[] args) {
        int hours = 14;
        int minutes = 27;
        int minutesSinceMn = (hours * 60) + minutes;
        int secondsSinceMn = minutesSinceMn * 60;
        System.out.printf("time: %d:%d%n", hours, minutes);
        System.out.println("minutes from mindnight: " + minutesSinceMn);
        System.out.println("seconds from mindnight: " + secondsSinceMn);
    }
}
