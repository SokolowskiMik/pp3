import java.util.Arrays;
public class C6 extends Vehicle {

    public static void main(String[] args) {
        C6 myCar = new C6(4,200);
        int[] carSpec = myCar.spec();
        System.out.println(Arrays.toString(carSpec));
     }
    private int maxSpeed;

    public C6(int s, int maxSpeed) {
        super(s);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        int seats = getSeats();
        int[] a = {seats, maxSpeed};
        return a;
    }

    
}
