

public class D1e1 {
    public static void main(String[] args) {

    double length= Double.parseDouble(args[0]);
double breadth=Double.parseDouble(args[1]);

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
