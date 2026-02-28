import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int original = number;
            int reversed = 0;

            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a palindrome number.");
            } else {
                System.out.println(original + " is not a palindrome number.");
            }
        }
    }
}
