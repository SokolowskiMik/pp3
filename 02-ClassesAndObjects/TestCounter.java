public class TestCounter {
    public static void main(String[] args) {
        Counters c1 = new Counters();
        Counters c2 = new Counters();

        c1.AddOne();
        c1.AddOne();
        c1.AddOne();
        c1.AddTen();
        c1.AddTen();
        c2.SubtractTen();
        c2.SubtractTen();
        c2.SubtractTen();
        c2.SubtractTen();
        c2.SubtractTen();
        c2.AddOne();
        c2.AddOne();
        c2.AddOne();
    }
}
