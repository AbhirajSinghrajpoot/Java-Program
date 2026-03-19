import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        long originalNumber = number;
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            number = Math.abs(number);
            while (number > 0) {
                count++;
                number /= 10;
            }
        }

        String type = originalNumber < 0 ? "negative" : "non-negative";
        System.out.println("Number of digits in " + originalNumber + " is: " + count);
        System.out.println("Input type: " + type);
        scanner.close();
    }
}