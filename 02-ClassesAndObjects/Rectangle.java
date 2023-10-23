public class Rectangle {
    double length;
    double width;


    void Dimensions() {
        System.out.println("Length: " + length + " Width: " + width);
    }

    void Perimeter() {
        double perimeter = (length+width) * 2;
        System.out.println("perimeter = " + perimeter);
    }

    void Surface() {
        double surface = length*width;
        System.out.println("surface = " + surface);
    }
}
