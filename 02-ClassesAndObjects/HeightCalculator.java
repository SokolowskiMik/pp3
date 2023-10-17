public class HeightCalculator {
    
    public static void main(String[] args) {
        int myHeight = 190;
        int feet = (int)(myHeight / 30.48);
        int inches = (int)((myHeight % 30.48)/2.54);

        System.out.println("I am " + myHeight+"cm "+ "tall and that's " + feet + " feet " + inches + " inches");
    }
}
