import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int value : arr) {
            uniqueElements.add(value);
        }

        System.out.println("Array after removing duplicates:");
        for (int value : uniqueElements) {
            System.out.print(value + " ");
        }
        System.out.println();

        scanner.close();
    }
}