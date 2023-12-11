import java.util.*;

public class TestSets {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(5);
        Set<Integer> set = new HashSet<>(list);

        System.out.println(list.size() + " set = " + set.size());
    }
}
