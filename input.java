import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        // input
        // Scanner class

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println(name);
        }
        }
}
