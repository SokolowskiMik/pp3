import java.util.*;

public class C5 extends Counter {
    public static void main(String[] args) {
        C5 c = new C5(0);
        System.out.println(c.getCounter());
        c.add1();
        c.addN(3);
        System.out.println(c.getCounter());
    }
    public C5(int c) {
        super(c);
    }

    public void addN(int n) {
        for (int i=0; i < n; i++) {
            add1();
        }
    }

    
}
