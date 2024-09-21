import java.util.Scanner;
  public class Geometry {
    public static void main(String[] args) {
        // Rectangle
        double length = 5.0;
        double width = 3.0;

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // Circle
        double radius = 4.0;

        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference of the circle: " + circumference);
    }
}
