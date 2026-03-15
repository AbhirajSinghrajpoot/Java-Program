import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start range: ");
        int start = scanner.nextInt();
        System.out.print("Enter end range: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers in range:");
        for (int number = start; number <= end; number++) {
            int temp = number;
            int digits = String.valueOf(number).length();
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == number) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}