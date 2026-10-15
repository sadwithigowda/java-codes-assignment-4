import java.util.Scanner;

class RectangleShape {
    double length;
    double breadth;

    RectangleShape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        RectangleShape rect = new RectangleShape(l, b);
        System.out.println("Area of the rectangle = " + rect.area());
        sc.close();
    }
}
