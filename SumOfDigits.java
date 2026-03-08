import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int original = number;
            int sum = 0;

            number = Math.abs(number);

            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            System.out.println("Sum of digits of " + original + " is: " + sum);
        }
    }
}
