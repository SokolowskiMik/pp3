public class SurfaceArea {
    public static float rectangle(int a, int b){
        return a*b;
    }

    public static double cuboid(double l, double w, double h) {
        double area = 2*(l*w+w*h+l*h);
        return area;
    }

    public static double sphere(double r) {
        double area = 4*Math.PI*Math.pow(r,2);
        return area;
    }

    public static double cone(double r, double L) {
        double area = Math.PI*Math.pow(r,2)+Math.PI*L*r;
        return area;
    }
}

