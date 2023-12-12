import java.util.*;
public class C1 {
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private List<Integer> numbersList;

    public C1(int n1, int n2, int n3, int n4, int n5) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.numbersList = new ArrayList<>();
    }

    public boolean different() {
        numbersList.add(this.n1);
        numbersList.add(this.n2);
        numbersList.add(this.n3);
        numbersList.add(this.n4);
        numbersList.add(this.n5);
        Set<Integer> s = new HashSet<>(numbersList);
        if (numbersList.size() == s.size()) {
            return true;
        } else {
            return false;
        }
    }
}
