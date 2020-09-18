package convertradius;
import java.util.Scanner;

public class CircleCalculator  {

    private static final Scanner scanner = new Scanner( System.in );

    public void displayCircumference(double radius) {
        double circumference = 2 * 3.14 * radius;
        System.out.format("Circumference of Circle = %.2f", circumference);

    }

    public void displayArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.format("\nArea of circle = %.2f", area);

    }

    public static double getRadius() {
        System.out.print( "Type Radius: " );
        double radius = scanner.nextDouble();

        return radius;
    }

    public static void main(String[] args) {
        CircleCalculator calc = new CircleCalculator();

        double radius = calc.getRadius();
        calc.displayCircumference(radius);
        calc.displayArea(radius);

    }
}
