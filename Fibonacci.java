import java.util.Scanner;

public class Fibonacci {

    public static void printFibonacci(int n) {
        long a = 0, b = 1;

        System.out.print("Fibonacci series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        printFibonacci(n);

        sc.close();
    }
}
