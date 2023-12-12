import java.util.*;
public class C3 {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 6);
        Person person3 = new Person("Charlie", 22);
        C3 f = new C3(new Person[]{person1,person2,person3});
        System.out.println(f.adults());
    }

    private Person[] family;

    public C3(Person[] family) {
        this.family = family;
    }

    public int adults() {
        List<Integer> adults = new ArrayList<>();

        for (Person p:this.family) {
            if (p.getAge() >= 18) {
                adults.add(p.getAge());
            }
        }
        return adults.size();
    }

    
}
