public class Circle extends Shape{

    public static void main(String[] args) {
        Circle C = new Circle(2);
        System.out.println(C.area());
    }
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area;
        area = Math.PI * radius*radius;
        return area;
    }
    
}
