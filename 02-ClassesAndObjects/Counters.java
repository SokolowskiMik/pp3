public class Counters {
    int value = 0;

    void AddOne() {
        value += 1;
        System.out.println(value);
    }

    void SubtractOne() {
        value -= 1;
        System.out.println(value);
    }

    void AddTen() {
        value += 10;
        System.out.println(value);
    }

    void SubtractTen() {
        value -= 10;
        System.out.println(value);
    }

    void Reset() {
        value = 0;
        System.out.println(value);
    }
}
