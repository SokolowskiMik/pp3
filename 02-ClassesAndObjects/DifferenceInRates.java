public class DifferenceInRates {
    public static void main(String[] args) {
        double bankBuys = 4.5940;
        double bankSells = 4.6250;
        double spread = bankSells - bankBuys;
        System.out.printf("Bank buys EUR: %.4f\n", bankBuys);
        System.out.printf("Bank sells EUR: %.4f\n", bankSells);
        System.out.printf("Spread: %.4f", spread);
    }
}
