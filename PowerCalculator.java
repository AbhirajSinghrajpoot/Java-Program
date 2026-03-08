import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter base number: ");
            double base = scanner.nextDouble();

            System.out.print("Enter exponent: ");
            int exponent = scanner.nextInt();

            double result = Math.pow(base, exponent);

            System.out.println(base + " raised to power " + exponent + " is: " + result);
        }
    }
}
