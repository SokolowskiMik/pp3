public class Statistics {
    public static int itemNum(int x, int y) {
        int counter = 0;
        for (int i=x; i <= y; i++) {
            counter++;
        }
        return counter;
    }

    public static int rangeSum(int x, int y) {
        int sum = 0;
        for (int i=x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }

    public static int artMean(int x, int y) {
        int mean = 0;
        int counter = 0;
        int sum = 0;
        for (int i=x; i<= y; i++) {
            counter++;
            sum += i;
        }
        mean = sum/counter;
        return mean;
    }
}
