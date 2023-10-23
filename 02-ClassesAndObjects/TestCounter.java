public class TestCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

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
