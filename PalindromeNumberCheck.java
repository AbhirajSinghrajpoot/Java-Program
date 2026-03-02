import java.util.Scanner;

public class PalindromeNumberCheck {

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num))
            System.out.println("Number is Palindrome.");
        else
            System.out.println("Number is NOT Palindrome.");

        sc.close();
    }
}
