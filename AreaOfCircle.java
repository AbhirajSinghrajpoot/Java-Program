import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter radius of circle: ");
            double radius = scanner.nextDouble();

            double area = Math.PI * radius * radius;
            
            double circumference = 2 * Math.PI * radius;

            System.out.println("Area of circle: " + area);
            System.out.println("Circumference of circle: " + circumference);
        
        }
    }
}
