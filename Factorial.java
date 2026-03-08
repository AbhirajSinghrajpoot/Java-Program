import java.util.Scanner;

public class Factorial {

    public static long factorial(int n) {
        if (n < 0) return -1;

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long ans = factorial(n);

        if (ans == -1)
            System.out.println("Factorial not defined for negative numbers.");
        else
            System.out.println("Factorial of " + n + " is: " + ans);

        sc.close();
    }
}
