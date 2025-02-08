import java.util.Scanner;
public class TriangleArea {
    
    public static double areaOfTriangleBaseHeight(double base, double height) {
        return 0.5 * base * height;
    }
        public static double areaOfTriangleHeron(double a, double b, double c) {
        double s = (a + b + c) / 2; 
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();
        System.out.println("Area using base-height method: " + areaOfTriangleBaseHeight(base, height));

        System.out.print("Enter first side: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter second side: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter third side: ");
        double side3 = scanner.nextDouble();
        System.out.println("Area using Heron's formula: " + areaOfTriangleHeron(side1, side2, side3));

        scanner.close();
    }
}
