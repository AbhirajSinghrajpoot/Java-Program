import java.util.Scanner;

public class DecimalToBinary {
    public static String convertToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        int n = number;

        while (n > 0) {
            binary.append(n % 2);
            n /= 2;
        }

        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            System.out.println("Binary representation: " + convertToBinary(number));
        }

        sc.close();
    }
}
