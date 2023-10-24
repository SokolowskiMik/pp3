public class MyCalendar {
    static int year=2023;
    static int month=4;
    static int day=9;

    public static String myDate() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    public static int days() {
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        int passed = 0;
        for (int days=0; days<(month-1); days++) {
            passed += monthDays[days];
        }
        passed += day;
        return passed;
    }

    public static String monthName() {
        String[] monthName = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return monthName[month-1];
    }

    public static void main(String[] args) {
        System.out.println(MyCalendar.myDate());
        System.out.println(MyCalendar.days());
        System.out.println(MyCalendar.monthName());
    }
}
